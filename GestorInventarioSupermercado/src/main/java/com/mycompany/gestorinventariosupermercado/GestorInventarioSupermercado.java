package com.mycompany.gestorinventariosupermercado;

import java.io.*;

public class GestorInventarioSupermercado {
    // Metodos Auxiliares
    public static void limpiarPantalla() {
        try {
            final String os = System.getProperty("os.name");
            System.out.println(os);
            if (os.contains("Windows")) {  
              Runtime.getRuntime().exec("cls");  
            }
            else {  
              Runtime.getRuntime().exec("clear");  
            } 
        }  
        catch (final Exception e) {  
          e.printStackTrace();  
        }
    }

    public static void pausar() {
        System.out.println("Presione ENTER para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Metodo para agregar datos iniciales al gestor
    public static void cargarDatosIniciales(Gestor gestor) {
        // Crear proveedores
        Proveedor proveedor1 = new Proveedor("Proveedor A", "proveedora@example.com");
        Proveedor proveedor2 = new Proveedor("Proveedor B", "proveedorb@example.com");
        Proveedor proveedor3 = new Proveedor("Proveedor C", "proveedorc@example.com");
    
        // Crear productos
        Producto producto1 = new Producto("Manzanas", 2500, 200);
        Producto producto2 = new Producto("Plátanos", 1800, 150);
        Producto producto3 = new Producto("Naranjas", 3000, 100);
        Producto producto4 = new Producto("Leche", 1000, 300);
        Producto producto5 = new Producto("Huevos", 2200, 250);
        Producto producto6 = new Producto("Pan", 1500, 200);
        Producto producto7 = new Producto("Arroz", 2000, 400);
        Producto producto8 = new Producto("Fideos", 1800, 350);
        Producto producto9 = new Producto("Gomitas", 500, 1000);
    
        // Asociar productos a proveedores
        proveedor1.agregarProductoSuministrado(producto1);
        proveedor1.agregarProductoSuministrado(producto2);
        proveedor2.agregarProductoSuministrado(producto2);
        proveedor2.agregarProductoSuministrado(producto3);
        proveedor3.agregarProductoSuministrado(producto4);
        proveedor3.agregarProductoSuministrado(producto5);
        proveedor3.agregarProductoSuministrado(producto6);
        proveedor3.agregarProductoSuministrado(producto7);
        proveedor3.agregarProductoSuministrado(producto8);
        proveedor3.agregarProductoSuministrado(producto9);
    
        // Agregar proveedores y productos al gestor
        gestor.getProveedores().add(proveedor1);
        gestor.getProveedores().add(proveedor2);
        gestor.getProveedores().add(proveedor3);
    
        gestor.getMapaProductos().put(producto1.getNombre(), producto1);
        gestor.getMapaProductos().put(producto2.getNombre(), producto2);
        gestor.getMapaProductos().put(producto3.getNombre(), producto3);
        gestor.getMapaProductos().put(producto4.getNombre(), producto4);
        gestor.getMapaProductos().put(producto5.getNombre(), producto5);
        gestor.getMapaProductos().put(producto6.getNombre(), producto6);
        gestor.getMapaProductos().put(producto7.getNombre(), producto7);
        gestor.getMapaProductos().put(producto8.getNombre(), producto8);
        gestor.getMapaProductos().put(producto9.getNombre(), producto9);
    }

    public static void main(String[] args) throws IOException, NumberFormatException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        Gestor gestor = new Gestor(); // Crea una instancia del Gestor

        // Cargar datos iniciales
        cargarDatosIniciales(gestor);
        
        while (true) {
            int opcion;

            limpiarPantalla();
            System.out.println("=============================================================");
            System.out.println("Sistema de Gestion de Productos Suministrados por Proveedores");
            System.out.println("=============================================================");
            System.out.println("1) Agregar Producto a Proveedor");
            System.out.println("2) Eliminar Producto a Proveedor");
            System.out.println("3) Buscar Producto de Proveedor");
            System.out.println("4) Lista de Productos de Proveedor");
            System.out.println("5) Mostrar Productos y su stock");
            System.out.println("6) Salir");
            System.out.println("=============================================================");
            System.out.print("Opción: ");

            opcion = Integer.parseInt(lector.readLine());

            switch (opcion) {
                case 1:
                    // ================================
                    // Agregar Producto a Proveedor
                    // ================================
                    // Se solicita el nombre del proveedor
                    System.out.println("Ingrese el nombre del proveedor: ");
                    String nombreProveedor = lector.readLine();

                    // Se solicita el nombre del producto y sus datos
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombreProducto = lector.readLine();

                    System.out.println("Ingrese el precio del producto: ");
                    double precio = Double.parseDouble(lector.readLine());

                    System.out.println("Ingrese la cantidad en stock del producto: ");
                    int cantidadStock = Integer.parseInt(lector.readLine());

                    // Se crea el producto
                    Producto producto = new Producto(nombreProducto, precio, cantidadStock);

                    // Se agrega el producto al proveedor
                    if (gestor.agregarProductoAProveedor(nombreProveedor, producto)) {
                        System.out.println("Producto agregado con éxito.");
                    } else {
                        System.out.println("No se pudo agregar el producto.");
                    }

                    break;
                case 2:
                    // ================================
                    // Eliminar Proveedor a Proveedor
                    // ================================
                    
                    // Se solicita el nombre del proveedor
                    System.out.println("Ingrese el nombre del proveedor: ");
                    nombreProveedor = lector.readLine();

                    // Se solicita el nombre del producto
                    System.out.println("Ingrese el nombre del producto: ");
                    nombreProducto = lector.readLine();

                    // Se verifica cuanto stock tiene el producto en el proveedor
                    Proveedor proveedor = gestor.buscarProveedor(nombreProveedor);
                    Producto productoExistente = proveedor.buscarProductoSuministrado(nombreProducto);
                    int stockActual = productoExistente.getCantidadStock();

                    // Se solicita la cantidad a eliminar dependiendo del stock actual
                    System.out.println("Ingrese la cantidad a eliminar (Stock actual: " + stockActual + "): ");
                    int cantidadEliminar = Integer.parseInt(lector.readLine());

                    // Se verifica que la cantidad a eliminar no sea mayor al stock actual
                    if (cantidadEliminar > stockActual) {
                        System.out.println("La cantidad a eliminar no puede ser mayor al stock actual.");
                        break;
                    }

                    // Se elimina el producto del proveedor
                    Producto productoEliminado = gestor.eliminarProductoAProveedor(nombreProveedor, nombreProducto, cantidadEliminar);

                    // Se verifica si el producto fue eliminado
                    if (productoEliminado != null) {
                        System.out.println("Producto eliminado con éxito.");
                    } else {
                        System.out.println("No se pudo eliminar el producto.");
                    }

                    break;
                case 3:
                    // ================================
                    // Buscar Producto de Proveedor
                    // ================================

                    break;
                case 4:
                    // ========================================
                    // Mostrar Lista de Productos del Proveedor
                    // ========================================

                    break;
                case 5:
                    // ========================================
                    // Mostrar Productos y su Stock
                    // ========================================
                    
                    // Se muestran los productos y su stock
                    gestor.mostrarProductosStock();
                    break;
                case 6:
                    // ========================================
                    // Salir
                    // ========================================
                    
                    System.out.println("Saliendo...");

                    pausar();

                    lector.close();

                    System.exit(0);
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            pausar();

            // Se limpia el buffer
            lector.readLine();
        }
    }
}
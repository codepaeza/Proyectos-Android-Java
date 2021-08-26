package com.paez.edwin.i_wish.tools;

/**
 * Created by PC on 11/01/2018.
 */

/**
 * Clase que contiene los códigos usados en "I Wish" para
 * mantener la integridad en las interacciones entre actividades
 * y fragmentos
 */
public class Constantes {
    /**
     * Transición Home -> Detalle
     */
    public static final int CODIGO_DETALLE = 100;

    /**
     * Transición Detalle -> Actualización
     */
    public static final int CODIGO_ACTUALIZACION = 101;
    /**
     * Puerto que utilizas para la conexión.
     * Dejalo en blanco si no has configurado esta carácteristica.
     */
   private static final String PUERTO_HOST = "21";
    /**
     * Dirección IP de genymotion o AVD
     */
    private static final String IP = "https://appreggio.000webhostapp.com/";
    /**
     * URLs del Web Service
     */

    public static final String GET = IP + PUERTO_HOST + "/id4101705_bdappreggio/obtener_metas.php";
    public static final String GET_BY_ID =IP + PUERTO_HOST + "/id4101705_bdappreggio/obtener_meta_por_id.php";
    public static final String UPDATE = IP + PUERTO_HOST + "/id4101705_bdappreggio/actualizar_meta.php";
    public static final String DELETE = IP + PUERTO_HOST + "/id4101705_bdappreggio/borrar_meta.php";
    public static final String INSERT = IP + PUERTO_HOST + "/id4101705_bdappreggio/insertar_meta.php";

    /**
     * Clave para el valor extra que representa al identificador de una meta
     */
    public static final String EXTRA_ID = "IDEXTRA";

}

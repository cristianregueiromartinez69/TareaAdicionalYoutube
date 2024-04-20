

package com.dam.cristian.youtubelayouts;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

public class Youtube extends JFrame {

    private JPanel panelPrincipal;
    private JPanel panelConVideos;
    private JPanel videosLaterales;
    private JPanel reproducirVideos;
    private JPanel buscarVideos;
    private JLabel poner_imagen_video;
    private JLabel IndicadorvideosMásVistos;
    private JLabel indicadorVideosRecomendados;
    private JTextArea video_encontrado;
    private JButton botonVideo1;
    private JButton botonVideo2;
    private JButton botonVideo3;
    private String video1;
    private String video2;
    private String video3;
    private String imagen_video;
    private JTextField barraBusquedaVideos;
    private JButton buscarVideo;
    private JButton play;
    private JButton pause;
    private JButton stop;
    private JTextArea confirmarAccion;
    private JPanel panelDescripcionVideo;
    private JLabel indicador_titulo_video_actual;
    private JTextArea titulo_video_actual;
    private JLabel indicador_descripcion_video_actual;
    private JTextArea descripcion_titulo_actual;
    private JLabel indicador_comentarios_video_actual;
    private JTextArea comentarios_video_actual;
    private ImageIcon icon;
    private Image image;
    private String[] video_a_buscar_actual = new String[3];

    public Youtube() {
        setTitle("Youtube");
        setBounds(500, 600, 800, 800);
        setVisible(true);
        panelPrincipal = new JPanel();
        panelPrincipal.setPreferredSize(new Dimension(200, 300));
        panelPrincipal.setLayout(new BorderLayout());
        add(panelPrincipal, BorderLayout.CENTER);

        panelConVideos = new JPanel();
        panelConVideos.setLayout(new BorderLayout());
        panelPrincipal.add(panelConVideos, BorderLayout.CENTER);
        imagen_video = "imagen_video_java4.jpg";
        ImageIcon iconvideo1 = new ImageIcon(imagen_video);
        image = iconvideo1.getImage();
        poner_imagen_video = new JLabel();
        poner_imagen_video.setBorder(new EmptyBorder(0, 50, 0, 0));
        icon = new ImageIcon(imagen_video);
        image = icon.getImage();
        Image scaledImage = image.getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        poner_imagen_video.setIcon(scaledIcon);
        panelConVideos.add(poner_imagen_video, BorderLayout.CENTER);

        videosLaterales = new JPanel();
        videosLaterales.setLayout(new BoxLayout(videosLaterales, BoxLayout.Y_AXIS));
        panelPrincipal.add(videosLaterales, BorderLayout.EAST);

        IndicadorvideosMásVistos = new JLabel("Videos más vistos");
        videosLaterales.add(IndicadorvideosMásVistos);

        botonVideo1 = new JButton("Trailer Banjo Kazooie");
        videosLaterales.add(botonVideo1);

        botonVideo2 = new JButton("Mbappe viene al madrid");
        videosLaterales.add(botonVideo2);

        botonVideo3 = new JButton("Juego de mario bross");
        videosLaterales.add(botonVideo3);

        indicadorVideosRecomendados = new JLabel("Videos encontrados");
        videosLaterales.add(indicadorVideosRecomendados);
        video_encontrado = new JTextArea();
        videosLaterales.add(video_encontrado);

        reproducirVideos = new JPanel();
        reproducirVideos.setLayout(new FlowLayout());
        panelPrincipal.add(reproducirVideos, BorderLayout.SOUTH);

        play = new JButton("|>");
        reproducirVideos.add(play);

        pause = new JButton("||");
        reproducirVideos.add(pause);

        stop = new JButton("X");
        reproducirVideos.add(stop);

        confirmarAccion = new JTextArea();
        reproducirVideos.add(new JScrollPane(confirmarAccion));
        video_a_buscar_actual[0] = "Trailer Banjo Kazooie";
        video_a_buscar_actual[1] = "Mbappe viene al madrid";
        video_a_buscar_actual[2] = "Juego de mario bross";

        buscarVideos = new JPanel();
        buscarVideos.setLayout(new FlowLayout());
        panelPrincipal.add(buscarVideos, BorderLayout.NORTH);

        barraBusquedaVideos = new JTextField(12);
        buscarVideos.add(barraBusquedaVideos);

        buscarVideo = new JButton("Buscar");
        buscarVideos.add(buscarVideo);
        panelDescripcionVideo = new JPanel();
        panelDescripcionVideo.setPreferredSize(new Dimension(200, 200));
        panelDescripcionVideo.setLayout(new BoxLayout(panelDescripcionVideo, BoxLayout.Y_AXIS));
        panelPrincipal.add(panelDescripcionVideo, BorderLayout.WEST);
        indicador_titulo_video_actual = new JLabel("Titulo");
        panelDescripcionVideo.add(indicador_titulo_video_actual);
        titulo_video_actual = new JTextArea();
        titulo_video_actual.setEditable(false);
        panelDescripcionVideo.add(titulo_video_actual);
        indicador_descripcion_video_actual = new JLabel("Descripcion");
        panelDescripcionVideo.add(indicador_descripcion_video_actual);
        descripcion_titulo_actual = new JTextArea();
        descripcion_titulo_actual.setEditable(false);
        panelDescripcionVideo.add(descripcion_titulo_actual);
        indicador_comentarios_video_actual = new JLabel("Comentarios");
        panelDescripcionVideo.add(indicador_comentarios_video_actual);
        comentarios_video_actual = new JTextArea();
        comentarios_video_actual.setEditable(false);
        panelDescripcionVideo.add(comentarios_video_actual);

        botonVideo1.addActionListener(this::cambioGameplay);
        botonVideo2.addActionListener(this::cambioGameplay);
        botonVideo3.addActionListener(this::cambioGameplay);
        play.addActionListener(this::reproducirVideo);
        pause.addActionListener(this::reproducirVideo);
        stop.addActionListener(this::reproducirVideo);
        buscarVideo.addActionListener(this::busquedaVideo);
    }

    public void cambioGameplay(ActionEvent e) {

        if (e.getSource() == botonVideo1) {
            //para quitar una imagen y poner otra
            poner_imagen_video.setIcon(null);
            imagen_video = "imagen_video_java1.jpg";
            ImageIcon iconvideo1 = new ImageIcon(imagen_video);
            image = iconvideo1.getImage();
            poner_imagen_video = new JLabel();
            poner_imagen_video.setBorder(new EmptyBorder(0, 50, 0, 0));
            icon = new ImageIcon(imagen_video);
            image = icon.getImage();
            Image scaledImage = image.getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            poner_imagen_video.setIcon(scaledIcon);
            panelConVideos.add(poner_imagen_video, BorderLayout.CENTER);
            confirmarAccion.setText("Video de banjo kazooie");
            titulo_video_actual.setText("Consiguiendo el último jiggy");
            descripcion_titulo_actual.setText("Redes sociales en la descripcion");
            comentarios_video_actual
                    .setText("Que guapada de juego" + "\nMe encanta banjo" + "\nmas malo que pegarle a un anciano");

        } else if (e.getSource() == botonVideo2) {
            //para quitar una imagen y poner otra
            poner_imagen_video.setIcon(null);
            imagen_video = "imagen_video_java2.jpg";
            ImageIcon iconvideo2 = new ImageIcon(imagen_video);
            image = iconvideo2.getImage();
            poner_imagen_video = new JLabel();
            poner_imagen_video.setBorder(new EmptyBorder(0, 50, 0, 0));
            icon = new ImageIcon(imagen_video);
            image = icon.getImage();
            Image scaledImage = image.getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            poner_imagen_video.setIcon(scaledIcon);
            panelConVideos.add(poner_imagen_video, BorderLayout.CENTER);
            confirmarAccion.setText("Video de mbappe");
            titulo_video_actual.setText("mabppe ya firmo el 1 de enero");
            descripcion_titulo_actual.setText("me lo dijo Trunksrm");
            comentarios_video_actual.setText("se viene" + "\nestoy mojado de la emocion" + "\ncubarsi te seco pendejo");

        } else if (e.getSource() == botonVideo3) {
            //para quitar una imagen y poner otra
            poner_imagen_video.setIcon(null);
            imagen_video = "imagen_video_java3.jpg";
            ImageIcon iconvideo3 = new ImageIcon(imagen_video);
            image = iconvideo3.getImage();
            poner_imagen_video = new JLabel();
            poner_imagen_video.setBorder(new EmptyBorder(0, 50, 0, 0));
            icon = new ImageIcon(imagen_video);
            image = icon.getImage();
            Image scaledImage = image.getScaledInstance(1000, 800, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);
            poner_imagen_video.setIcon(scaledIcon);
            panelConVideos.add(poner_imagen_video, BorderLayout.CENTER);
            confirmarAccion.setText("Video de mario bross");
            titulo_video_actual.setText("analisis de mario wonder");
            descripcion_titulo_actual.setText("haciendo un analisis de mario wonder");
            comentarios_video_actual
                    .setText("mario elefante es god" + "\nMe encanta mario" + "\npara cuando mario party 100");

        }
        panelConVideos.revalidate();
        panelConVideos.repaint();

    }

    public void reproducirVideo(ActionEvent e) {

        if (e.getSource() == play) {
            confirmarAccion.setText("reproduciendo");
        } else if (e.getSource() == pause) {
            confirmarAccion.setText("video pausado");
        } else if (e.getSource() == stop) {
            confirmarAccion.setText("video revominado al 0");
        }

    }

    public void busquedaVideo(ActionEvent e) {
        if (e.getSource() == buscarVideo) {

            String aux_video_buscar = barraBusquedaVideos.getText();
            for (int i = 0; i < video_a_buscar_actual.length; i++) {
                if (aux_video_buscar.equalsIgnoreCase(video_a_buscar_actual[i])) {
                    aux_video_buscar = video_a_buscar_actual[i];
                }
            }
            if (aux_video_buscar == video_a_buscar_actual[0] || aux_video_buscar == video_a_buscar_actual[1]
                    || aux_video_buscar == video_a_buscar_actual[2]) {

                video_encontrado.setText("Titulo: " + aux_video_buscar + "\nvideo encontrado");
            } else {
                video_encontrado.setText("Video no encontrado");
            }

        }
    }
}
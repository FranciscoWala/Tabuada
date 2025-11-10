package br.senai.sp.jandira.tabuada.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaTabuada extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        // Setar tamanho, altura e largura da tela.

        stage.setWidth(500);
        stage.setHeight(500);
        stage.setTitle("Tabuada");

        // Criar o root - componente de leiaute principal
        VBox root = new VBox();
        root.setStyle("-fx-background-color: #cae7d5;");

        // Criamos a cena e colocamos o ROOT nela
        Scene scene = new Scene(root);

        // Criar header da tela
        VBox header = new VBox();
        header.setPrefHeight(100);
        header.setStyle("-fx-background-color: #651ce1;");

        // Colocar o conteudo do header
        Label labelTitulo = new Label("Tabuada");
        Label labelSubtitulo = new Label("Crie a tabuada que sua imaginação mandar.");
        labelTitulo.setStyle("-fx-text-fill: white;-fx-font-size: 40;-fx-font-weight: bold;");

        //Colocar as labels dentro do header
        header.getChildren().addAll(labelTitulo,labelSubtitulo);


        // Criar o grid de formulário
        GridPane gridFormulario = new GridPane();
        gridFormulario.setPrefHeight(100);
        gridFormulario.setStyle("-fx-background-color: #4a87e3;");

        // Criar o conteudo do gridFormulario
        Label labelMultiplicando = new Label("Multiplicando: ");
        TextField textFieldMultiplicando = new TextField();

        Label labelMenorMultiplicador = new Label("MenorMultiplicador: ");
        TextField textFieldMenorMultiplicador = new TextField();

        Label labelMaiorMultiplicador = new Label("MaiorMultiplicador: ");
        TextField textFieldMaiorMultiplicador = new TextField();

        //Colocar os componentes no grid
        gridFormulario.add(labelMultiplicando,0,0);
        gridFormulario.add(textFieldMultiplicando,1,0);
        gridFormulario.add(labelMenorMultiplicador,0,1);
        gridFormulario.add(textFieldMenorMultiplicador,1,1);
        gridFormulario.add(labelMaiorMultiplicador,0,2);
        gridFormulario.add(textFieldMaiorMultiplicador,1,2);

        // Criar a caixa dos botões
        HBox boxBotoes = new HBox();
        boxBotoes.setPrefHeight(100);
        boxBotoes.setStyle("-fx-background-color: #fa6868;");

        // Criar os botoes
        Button botaoCalcular = new Button("Calcular");
//        botaoCalcular.setPrefHeight(100);
        Button botaoLimpar = new Button("Limpar");
//        botaoLimpar.setPrefHeight(50);
        Button botaoSair = new Button("Salvar");
//        botaoSair.setPrefHeight(50);

        // Adicionar os botoes a caixa de botoes
        boxBotoes.getChildren().addAll(botaoCalcular,botaoLimpar,botaoSair);

        // Criar a caixa de resultado
        VBox boxResultado = new VBox();
        boxResultado.setPrefHeight(100);
        boxResultado.setStyle("-fx-background-color: #7bfa68;");

        // Criar os componentes da boxResultados
        Label labelResultado = new Label("Resultado: ");
        ListView listaTabuada = new ListView();
        String[] cidades = new String[5];
        // Criando dados para listview

        cidades[0] = "Itapevi";
        cidades[1] = "Rio";
        cidades[2] = "Sao Paulo";
        cidades[3] = "Brasil";
        cidades[4] = "Rio Branco";

        listaTabuada.getItems().addAll(cidades);



        // Adicionar os componentes ao boxResultados
        boxResultado.getChildren().addAll(labelResultado,listaTabuada);

        // Adicionar componentes ao root
        root.getChildren().addAll(header);
        root.getChildren().addAll(gridFormulario);
        root.getChildren().addAll(boxBotoes);
        root.getChildren().addAll(boxResultado);

        // Colocamos a cena no palco
        stage.setScene(scene);

        // Coloca para mostrar o root
        stage.show();
    }
}

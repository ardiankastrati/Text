����   = _
      java/lang/Object <init> ()V	  	 
   	Text/Text text Ljava/lang/String;	     countLetter I	     countRow  stop
      java/lang/String equals (Ljava/lang/Object;)Z  Stop  java/util/Scanner	 ! " # $ % java/lang/System in Ljava/io/InputStream;
  '  ( (Ljava/io/InputStream;)V	 ! * + , out Ljava/io/PrintStream; . Skriv in sträng: 
 0 1 2 3 4 java/io/PrintStream println (Ljava/lang/String;)V
  6 7 8 nextLine ()Ljava/lang/String;
  : ; < length ()I   > ? @ makeConcatWithConstants (II)Ljava/lang/String; (Ljava/lang/String;II)V Code LineNumberTable LocalVariableTable this LText/Text; newText newCountLetter newCountRow 	printText scan Ljava/util/Scanner; StackMapTable 
SourceFile 	Text.java BootstrapMethods R
 S T U ? V $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; X TDu skrev stop, därför svslutas programmet!
Du skrev  rad(er) och totalt  tecken. InnerClasses [ %java/lang/invoke/MethodHandles$Lookup ] java/lang/invoke/MethodHandles Lookup !                        A  B   l     *� *+� *� *� �    C       
   	      D   *     E F      G      H      I    J   B   �     d*� � � G*� � � ;� Y�  � &L� )-� /*+� 5� **� � 9*� `� **� `� ���� )*� *� � =  � /�    C   & 	      #  +  3  C  M  P ! c # D     # * K L    d E F   M     � O  N    O P     Q  W Y   
  Z \ ^ 
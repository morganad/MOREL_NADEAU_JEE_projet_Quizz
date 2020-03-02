# MOREL_NADEAU_JEE_projet_Quizz
Application de Quizz en JEE

Cette application permet de répondre à des quizzs sur différents thèmes.

Par manque de temps nous n'avons pas pu faire beaucoup de quizzs ni beaucoup de questions, mais le principe resterait le même.

De même, le fonctionnement a été favorisé, donc la mise en page et le style restent très basiques.

## Prérequis 

+ Java version 8
+ Créer une base de données avec comme nom "jee_projet_quizz" puis importer le fichier "jee_projet_quizz.sql" dans votre système de gestion de base de données MySQL.
+ Déployer l'application sur un serveur tomcat. Ne mettre que "/" comme Application Context dans l'onglet "Deployment".

## Description du projet

Ce projet dispose principalement de 6 éléments : Un utilisateur, son score, les quizzs, les questions de ce quizz, les réponses de ce quizz et les réponses de l'utilisateur.

Au lancement de l'application, vous vous trouverez sur l'index de notre site, contenant alors 2 boutons.
+ L'un vous permettra d'afficher le meilleur score et le dernier score de chacun des utilisateurs ayant enregistré son nom et son prénom à la fin du quiz.
+ L'autre vous affichera tous les quizzs disponibles.

Une fois un quizz sélectionné, l'utilisateur se trouvera devant une liste de questions auxquelles il pourra répondre en cliquant sur la réponse qu'il pense être la bonne.

Attention cependant, il n'est pas possible de revenir sur ses choix, un seul clique par question est permis.

De plus, chaque question non répondue sera comptabilisée comme une erreur.

Il est ensuite possible de voir son résultat, et d'enregistrer le score obtenu si l'utilisateur le souhaite, en indiquand son nom ainsi que son prénom.

## Fonctionnement

L'application suit un modèle MVC en se servant de Spring WebMVC. 

L'affichage de nos pages se fait en HTML, la gestion des éléments en Java et la liaison entre les deux en AngularJS.

L'application dispose de 6 entités, chacune dispose d'un DAO permettant d'accèder aux éléments nécessaires en base de données. 

Les méthodes définies dans le DAO sont appelées dans les classes du package Service et pourrant être utilisées dans les controllers.

# Controller

C'est dans ces classes que l'on va retrouver la principale gestion de l'application. 

Ici, elles servent principalement à envoyer des données en JSON aux pages web, mais aussi à sauvegarder en base de données un utilisateur qui n'existe pas déjà, ou à mettre un jour un score.

# webapp

Ce package contient toutes les pages HTML du projet ainsi que le script angularJS. 

Les pages HTML permettent le bon affichage des pages web de notre projet. Il y en a 6 et représentent :
+ Le point d'entrée du site (index.html)
+ La liste des quizzs (quizzs.html)
+ Le contenu d'un quizz (questionsquizz.html)
+ Les utilisateurs et leur score (utilisateurs.html)
+ Le résultat du quizz (score.html)
+ La validation d'enregistrement de score (enregistrement.html)

L'AngularJS nous permettra de récupérer des valeurs à afficher dans la page HTML, ou à exécuter des méthodes présentes dans le controller par exemple.

On se sert de Directives AngularJS telles que 
+ ng-click pour indiquer que faire lorsqu'un bouton est appuyé
+ ng-repeat pour avoir un template HTML identique pour chaque élément d'une collection
+ ng-controller qui permet d'ajouter un "controller" dans lequel on peut écrire du code, créer des fonctions et des variables qui pourront être utilisées dans l'html
+ etc.




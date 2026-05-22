# BankManager

## Description

BankManager est une application Java réalisée dans le cadre d’un exercice de programmation orientée objet.

Le programme permet de créer différents types de comptes bancaires :

- CheckingAccount (compte courant)
- SavingsAccount (compte épargne)
- COD (certificat de dépôt)

Ces classes héritent de la classe parent `BankAccount`.

L’application demande à l’utilisateur de saisir les informations des comptes puis affiche les données enregistrées.

Le programme gère également plusieurs erreurs utilisateur grâce aux exceptions (`try/catch`).

---

## Concepts utilisés

- Programmation Orientée Objet (POO)
- Classes et objets
- Héritage (`extends`)
- Scanner
- Boucles (`while`)
- Conditions (`if`)
- Exceptions (`try/catch`)

---

## Fonctionnalités

- Création de plusieurs types de comptes bancaires
- Vérification des numéros de compte
- Vérification des valeurs numériques
- Gestion des erreurs utilisateur
- Contrôle de la limite du compte
- Possibilité de créer plusieurs comptes sans relancer le programme

---

## Structure du projet

Le projet contient les classes suivantes :

- `BankAccount`
- `CheckingAccount`
- `SavingsAccount`
- `COD`
- `Main`

---

## Exemple de fonctionnement

Le programme demande :

1. Le numéro du compte
2. Le solde
3. Les informations spécifiques au type de compte

Ensuite les informations sont affichées à l’écran.

Si l’utilisateur entre une mauvaise valeur :
- le programme affiche une erreur,
- puis redemande la saisie sans s’arrêter.

---

## Technologies utilisées

- Java
- IntelliJ IDEA
- Git
- GitHub

---

GUEYE MALICK SIMON PIERRE RGL3

Projet réalisé dans le cadre d’un exercice de cours.

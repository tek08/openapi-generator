package api

import model.User

/**
  * Provides a default implementation for [[UserApi]].
  */

class UserApiImpl extends UserApi {
  /**
    * @inheritdoc
    */
<<<<<<< HEAD
  override def createUser(user: User): Unit = {
=======
  override def createUser(body: User): Unit = {
>>>>>>> ooof
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
<<<<<<< HEAD
  override def createUsersWithArrayInput(user: List[User]): Unit = {
=======
  override def createUsersWithArrayInput(body: List[User]): Unit = {
>>>>>>> ooof
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
<<<<<<< HEAD
  override def createUsersWithListInput(user: List[User]): Unit = {
=======
  override def createUsersWithListInput(body: List[User]): Unit = {
>>>>>>> ooof
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def deleteUser(username: String): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
  override def getUserByName(username: String): User = {
    // TODO: Implement better logic

    User(None, None, None, None, None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def loginUser(username: String, password: String): String = {
    // TODO: Implement better logic

    ""
  }

  /**
    * @inheritdoc
    */
  override def logoutUser(): Unit = {
    // TODO: Implement better logic

    
  }

  /**
    * @inheritdoc
    */
<<<<<<< HEAD
  override def updateUser(username: String, user: User): Unit = {
=======
  override def updateUser(username: String, body: User): Unit = {
>>>>>>> ooof
    // TODO: Implement better logic

    
  }
}

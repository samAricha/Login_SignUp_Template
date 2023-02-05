package teka.mobile.loginsignuptemplate

sealed class Routes(val route: String) {
    object Login : Routes("Login")
}
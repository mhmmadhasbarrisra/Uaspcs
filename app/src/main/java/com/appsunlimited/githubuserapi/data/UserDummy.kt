package com.appsunlimited.githubuserapi.data

object UserDummy {
    val list: ArrayList<User>
    get() {
        val list = arrayListOf<User>()

        list.add(User(
            "JakeWharton",
            "https://avatars0.githubusercontent.com/u/66577/?v=4",
            "https//github.com/JakeWharton",
            "https//api.github.com/users/JakaWharton/followers",
            "10",
            "https//api.github.com/users/JakaWharton/following{/other_user}",
            "15",
            "https//api.github.com/users/JakaWharton/repos",
            "10"
        ))

        list.add(User(
            "JakeWharton2",
            "https://avatars0.githubusercontent.com/u/66577/?v=4",
            "https//github.com/JakeWharton",
            "https//api.github.com/users/JakaWharton/followers",
            "10",
            "https//api.github.com/users/JakaWharton/following{/other_user}",
            "15",
            "https//api.github.com/users/JakaWharton/repos",
            "10"
        ))

        list.add(User(
            "JakeWharton3",
            "https://avatars0.githubusercontent.com/u/66577/?v=4",
            "https//github.com/JakeWharton",
            "https//api.github.com/users/JakaWharton/followers",
            "10",
            "https//api.github.com/users/JakaWharton/following{/other_user}",
            "15",
            "https//api.github.com/users/JakaWharton/repos",
            "10"
        ))

        list.add(User(
            "JakeWharton4",
            "https://avatars0.githubusercontent.com/u/66577/?v=4",
            "https//github.com/JakeWharton",
            "https//api.github.com/users/JakaWharton/followers",
            "10",
            "https//api.github.com/users/JakaWharton/following{/other_user}",
            "15",
            "https//api.github.com/users/JakaWharton/repos",
            "10"
        ))

        list.add(User(
            "JakeWharto5",
            "https://avatars0.githubusercontent.com/u/66577/?v=4",
            "https//github.com/JakeWharton",
            "https//api.github.com/users/JakaWharton/followers",
            "10",
            "https//api.github.com/users/JakaWharton/following{/other_user}",
            "15",
            "https//api.github.com/users/JakaWharton/repos",
            "10"
        ))

        return list
    }
}
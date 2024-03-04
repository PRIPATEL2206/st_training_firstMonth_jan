class User:
    def __init__(self, username):
        self.username = username
        self.posts = []
class SocialMediaPlatform:
    def __init__(self):
        self.users = []

    def create_user(self, username):
        new_user = User(username)
        self.users.append(new_user)
        print(f"User {username} created successfully.")

    def create_post(self, username, content):
        user = next((u for u in self.users if u.username == username), None)
        if user:
            post = {"username": username, "content": content}
            user.posts.append(post)
            print("Post created successfully.")
        else:
            print("User not found.")

    def view_posts(self, username):
        user = next((u for u in self.users if u.username == username), None)
        if user:
            print(f"Posts by {username}:")
            for post in user.posts:
                print(f"- {post['content']}")
        else:
            print("User not found.")

social_media = SocialMediaPlatform()

while True:
    print("\n1. Create User\n2. Create Post\n3. View Posts\n4. Exit")
    choice = input("Enter your choice (1-4): ")

    if choice == '1':
        username = input("Enter username: ")
        social_media.create_user(username)
    elif choice == '2':
        username = input("Enter your username: ")
        content = input("Enter your post content: ")
        social_media.create_post(username, content)
    elif choice == '3':
        username = input("Enter username: ")
        social_media.view_posts(username)
    elif choice == '4':
        print("Exiting the social media platform. Goodbye!")
        break
    else:
        print("Invalid choice. Please enter a number between 1 and 4.")
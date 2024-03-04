class Blog:
    def __init__(self):
        self.posts = []

    def view_posts(self):
        print("Blog Posts:")
        for index, post in enumerate(self.posts, start=1):
            print(f"{index}. {post['title']}")

    def view_post(self, post_id):
        if 1 <= post_id <= len(self.posts):
            post = self.posts[post_id - 1]
            print(f"\nTitle: {post['title']}\nContent: {post['content']}\n")
        else:
            print("Invalid post ID.")

    def create_post(self, title, content):
        new_post = {"title": title, "content": content}
        self.posts.append(new_post)
        print("New post created successfully.")

blog = Blog()

while True:
    print("\n1. View Posts\n2. View Post\n3. Create Post\n4. Exit")
    choice = input("Enter your choice (1-4): ")

    if choice == '1':
        blog.view_posts()
    elif choice == '2':
        post_id = int(input("Enter post ID: "))
        blog.view_post(post_id)
    elif choice == '3':
        title = input("Enter post title: ")
        content = input("Enter post content: ")
        blog.create_post(title, content)
    elif choice == '4':
        print("Exiting the blogging system. Goodbye!")
        break
    else:
        print("Invalid choice. Please enter a number between 1 and 4.")
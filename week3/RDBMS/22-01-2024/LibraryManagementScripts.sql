USE [master]
GO
/****** Object:  Database [library_management]    Script Date: 22-01-2024 17:31:01 ******/
CREATE DATABASE [library_management]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'library_management', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\library_management.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'library_management_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\library_management_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [library_management] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [library_management].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [library_management] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [library_management] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [library_management] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [library_management] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [library_management] SET ARITHABORT OFF 
GO
ALTER DATABASE [library_management] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [library_management] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [library_management] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [library_management] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [library_management] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [library_management] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [library_management] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [library_management] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [library_management] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [library_management] SET  ENABLE_BROKER 
GO
ALTER DATABASE [library_management] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [library_management] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [library_management] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [library_management] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [library_management] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [library_management] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [library_management] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [library_management] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [library_management] SET  MULTI_USER 
GO
ALTER DATABASE [library_management] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [library_management] SET DB_CHAINING OFF 
GO
ALTER DATABASE [library_management] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [library_management] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [library_management] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [library_management] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [library_management] SET QUERY_STORE = OFF
GO
USE [library_management]
GO
/****** Object:  Table [dbo].[Author_Table]    Script Date: 22-01-2024 17:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Author_Table](
	[author_id] [int] IDENTITY(1,1) NOT NULL,
	[author_name] [varchar](100) NULL,
	[birthday] [datetime] NULL,
	[nationality] [varchar](100) NULL,
	[biography] [varchar](1000) NULL,
PRIMARY KEY CLUSTERED 
(
	[author_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Book_Table]    Script Date: 22-01-2024 17:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Book_Table](
	[Book_id] [int] IDENTITY(1,1) NOT NULL,
	[title] [varchar](100) NOT NULL,
	[Genre_id] [int] NULL,
	[author_id] [int] NULL,
	[publication_date] [datetime] NULL,
	[is_available] [bit] NULL,
	[quantity] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Book_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Genre_Table]    Script Date: 22-01-2024 17:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Genre_Table](
	[genre_id] [int] IDENTITY(1,1) NOT NULL,
	[name] [varchar](250) NULL,
	[description] [varchar](250) NULL,
	[books_type_avail] [int] NULL,
	[created_at] [datetime] NULL,
	[update_time] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[genre_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Loans]    Script Date: 22-01-2024 17:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Loans](
	[loan_id] [int] IDENTITY(1,1) NOT NULL,
	[book_id] [int] NULL,
	[member_id] [int] NULL,
	[loan_date] [datetime] NULL,
	[return_date] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[loan_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Members_Table]    Script Date: 22-01-2024 17:31:01 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Members_Table](
	[member_id] [int] IDENTITY(1,1) NOT NULL,
	[member_name] [varchar](200) NULL,
	[Join_Date] [datetime] NULL,
	[ending_date] [datetime] NULL,
	[address] [varchar](500) NULL,
	[phone_no] [varchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[member_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Author_Table] ON 

INSERT [dbo].[Author_Table] ([author_id], [author_name], [birthday], [nationality], [biography]) VALUES (1, N'F. Scott Fitzgerald', CAST(N'1896-09-24T00:00:00.000' AS DateTime), N'American', N'F. Scott Fitzgerald was an American novelist, essayist, and short-story writer, known for his novels depicting the flamboyance and excess of the Jazz Age.')
INSERT [dbo].[Author_Table] ([author_id], [author_name], [birthday], [nationality], [biography]) VALUES (2, N'Harper Lee', CAST(N'1926-04-28T00:00:00.000' AS DateTime), N'American', N'Harper Lee was an American novelist widely known for To Kill a Mockingbird, published in 1960. Immediately successful, it won the Pulitzer Prize and has become a classic of modern American literature.')
INSERT [dbo].[Author_Table] ([author_id], [author_name], [birthday], [nationality], [biography]) VALUES (3, N'George Orwell', CAST(N'1903-06-25T00:00:00.000' AS DateTime), N'British', N'George Orwell was an English novelist, essayist, journalist, and critic. His work is characterized by lucid prose, biting social criticism, and awareness of social injustice.')
INSERT [dbo].[Author_Table] ([author_id], [author_name], [birthday], [nationality], [biography]) VALUES (4, N'Jane Austen', CAST(N'1775-12-16T00:00:00.000' AS DateTime), N'British', N'Jane Austen was an English novelist known primarily for her six major novels, which interpret, critique, and comment upon the British landed gentry at the end of the 18th century.')
INSERT [dbo].[Author_Table] ([author_id], [author_name], [birthday], [nationality], [biography]) VALUES (5, N'J.D. Salinger', CAST(N'1919-01-01T00:00:00.000' AS DateTime), N'American', N'J.D. Salinger was an American writer known for his widely read novel, The Catcher in the Rye. Following his early success publishing short stories and The Catcher in the Rye, Salinger led a very private life for more than a half-century.')
SET IDENTITY_INSERT [dbo].[Author_Table] OFF
GO
SET IDENTITY_INSERT [dbo].[Book_Table] ON 

INSERT [dbo].[Book_Table] ([Book_id], [title], [Genre_id], [author_id], [publication_date], [is_available], [quantity]) VALUES (2, N'The Great Gatsby', 1, 1, CAST(N'2022-01-01T00:00:00.000' AS DateTime), 1, 10)
INSERT [dbo].[Book_Table] ([Book_id], [title], [Genre_id], [author_id], [publication_date], [is_available], [quantity]) VALUES (3, N'To Kill a Mockingbird', 2, 2, CAST(N'2022-02-01T00:00:00.000' AS DateTime), 1, 15)
INSERT [dbo].[Book_Table] ([Book_id], [title], [Genre_id], [author_id], [publication_date], [is_available], [quantity]) VALUES (4, N'1984', 3, 3, CAST(N'2022-03-01T00:00:00.000' AS DateTime), 1, 20)
INSERT [dbo].[Book_Table] ([Book_id], [title], [Genre_id], [author_id], [publication_date], [is_available], [quantity]) VALUES (5, N'Pride and Prejudice', 1, 4, CAST(N'2022-04-01T00:00:00.000' AS DateTime), 1, 12)
INSERT [dbo].[Book_Table] ([Book_id], [title], [Genre_id], [author_id], [publication_date], [is_available], [quantity]) VALUES (6, N'The Catcher in the Rye', 2, 5, CAST(N'2022-05-01T00:00:00.000' AS DateTime), 1, 8)
SET IDENTITY_INSERT [dbo].[Book_Table] OFF
GO
SET IDENTITY_INSERT [dbo].[Genre_Table] ON 

INSERT [dbo].[Genre_Table] ([genre_id], [name], [description], [books_type_avail], [created_at], [update_time]) VALUES (1, N'Fiction', N'Literary works created from the imagination, not based on real events', 3, CAST(N'2022-01-01T00:00:00.000' AS DateTime), CAST(N'2022-01-15T00:00:00.000' AS DateTime))
INSERT [dbo].[Genre_Table] ([genre_id], [name], [description], [books_type_avail], [created_at], [update_time]) VALUES (2, N'Classics', N'Books that are widely accepted as exemplary and noteworthy of their genre', 2, CAST(N'2022-01-01T00:00:00.000' AS DateTime), CAST(N'2022-01-15T00:00:00.000' AS DateTime))
INSERT [dbo].[Genre_Table] ([genre_id], [name], [description], [books_type_avail], [created_at], [update_time]) VALUES (3, N'Dystopian', N'Books set in a future society where there is great suffering or injustice', 1, CAST(N'2022-01-01T00:00:00.000' AS DateTime), CAST(N'2022-01-15T00:00:00.000' AS DateTime))
SET IDENTITY_INSERT [dbo].[Genre_Table] OFF
GO
SET IDENTITY_INSERT [dbo].[Loans] ON 

INSERT [dbo].[Loans] ([loan_id], [book_id], [member_id], [loan_date], [return_date]) VALUES (3, 2, 1, CAST(N'2022-01-20T00:00:00.000' AS DateTime), CAST(N'2022-02-20T00:00:00.000' AS DateTime))
INSERT [dbo].[Loans] ([loan_id], [book_id], [member_id], [loan_date], [return_date]) VALUES (4, 3, 2, CAST(N'2022-02-25T00:00:00.000' AS DateTime), CAST(N'2022-03-25T00:00:00.000' AS DateTime))
INSERT [dbo].[Loans] ([loan_id], [book_id], [member_id], [loan_date], [return_date]) VALUES (5, 4, 3, CAST(N'2022-03-15T00:00:00.000' AS DateTime), CAST(N'2022-04-15T00:00:00.000' AS DateTime))
INSERT [dbo].[Loans] ([loan_id], [book_id], [member_id], [loan_date], [return_date]) VALUES (6, 5, 4, CAST(N'2022-04-10T00:00:00.000' AS DateTime), CAST(N'2022-05-10T00:00:00.000' AS DateTime))
INSERT [dbo].[Loans] ([loan_id], [book_id], [member_id], [loan_date], [return_date]) VALUES (7, 6, 5, CAST(N'2022-05-18T00:00:00.000' AS DateTime), CAST(N'2022-06-18T00:00:00.000' AS DateTime))
SET IDENTITY_INSERT [dbo].[Loans] OFF
GO
SET IDENTITY_INSERT [dbo].[Members_Table] ON 

INSERT [dbo].[Members_Table] ([member_id], [member_name], [Join_Date], [ending_date], [address], [phone_no]) VALUES (1, N'John Smith', CAST(N'2022-01-15T00:00:00.000' AS DateTime), CAST(N'2023-01-15T00:00:00.000' AS DateTime), N'123 Main St, Cityville', N'1234567890')
INSERT [dbo].[Members_Table] ([member_id], [member_name], [Join_Date], [ending_date], [address], [phone_no]) VALUES (2, N'Alice Johnson', CAST(N'2022-02-20T00:00:00.000' AS DateTime), CAST(N'2023-02-20T00:00:00.000' AS DateTime), N'456 Oak St, Townsville', N'9876543210')
INSERT [dbo].[Members_Table] ([member_id], [member_name], [Join_Date], [ending_date], [address], [phone_no]) VALUES (3, N'Bob Williams', CAST(N'2022-03-10T00:00:00.000' AS DateTime), CAST(N'2023-03-10T00:00:00.000' AS DateTime), N'789 Pine St, Villagetown', N'5551112233')
INSERT [dbo].[Members_Table] ([member_id], [member_name], [Join_Date], [ending_date], [address], [phone_no]) VALUES (4, N'Emily Davis', CAST(N'2022-04-05T00:00:00.000' AS DateTime), CAST(N'2023-04-05T00:00:00.000' AS DateTime), N'101 Elm St, Hamletville', N'9998887777')
INSERT [dbo].[Members_Table] ([member_id], [member_name], [Join_Date], [ending_date], [address], [phone_no]) VALUES (5, N'David Wilson', CAST(N'2022-05-12T00:00:00.000' AS DateTime), CAST(N'2023-05-12T00:00:00.000' AS DateTime), N'202 Cedar St, Countryside', N'3334445555')
SET IDENTITY_INSERT [dbo].[Members_Table] OFF
GO
ALTER TABLE [dbo].[Book_Table] ADD  DEFAULT ((1)) FOR [is_available]
GO
ALTER TABLE [dbo].[Book_Table]  WITH CHECK ADD FOREIGN KEY([author_id])
REFERENCES [dbo].[Author_Table] ([author_id])
GO
ALTER TABLE [dbo].[Book_Table]  WITH CHECK ADD FOREIGN KEY([Genre_id])
REFERENCES [dbo].[Genre_Table] ([genre_id])
GO
ALTER TABLE [dbo].[Loans]  WITH CHECK ADD FOREIGN KEY([book_id])
REFERENCES [dbo].[Book_Table] ([Book_id])
GO
ALTER TABLE [dbo].[Loans]  WITH CHECK ADD FOREIGN KEY([member_id])
REFERENCES [dbo].[Members_Table] ([member_id])
GO
USE [master]
GO
ALTER DATABASE [library_management] SET  READ_WRITE 
GO

USE [master]
GO
/****** Object:  Database [inventory_management]    Script Date: 22-01-2024 17:28:21 ******/
CREATE DATABASE [inventory_management]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'inventory_management', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\inventory_management.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'inventory_management_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\inventory_management_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [inventory_management] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [inventory_management].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [inventory_management] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [inventory_management] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [inventory_management] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [inventory_management] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [inventory_management] SET ARITHABORT OFF 
GO
ALTER DATABASE [inventory_management] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [inventory_management] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [inventory_management] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [inventory_management] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [inventory_management] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [inventory_management] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [inventory_management] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [inventory_management] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [inventory_management] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [inventory_management] SET  ENABLE_BROKER 
GO
ALTER DATABASE [inventory_management] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [inventory_management] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [inventory_management] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [inventory_management] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [inventory_management] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [inventory_management] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [inventory_management] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [inventory_management] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [inventory_management] SET  MULTI_USER 
GO
ALTER DATABASE [inventory_management] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [inventory_management] SET DB_CHAINING OFF 
GO
ALTER DATABASE [inventory_management] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [inventory_management] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [inventory_management] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [inventory_management] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [inventory_management] SET QUERY_STORE = OFF
GO
USE [inventory_management]
GO
/****** Object:  Table [dbo].[employees]    Script Date: 22-01-2024 17:28:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[employees](
	[eid] [int] IDENTITY(1,1) NOT NULL,
	[ename] [varchar](50) NULL,
	[Contactno] [varchar](50) NULL,
	[designation] [varchar](100) NULL,
	[salary] [int] NULL,
	[join_date] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[eid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[order_table]    Script Date: 22-01-2024 17:28:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[order_table](
	[order_id] [int] IDENTITY(1,1) NOT NULL,
	[supplier_id] [int] NOT NULL,
	[total_amount] [decimal](10, 2) NULL,
	[order_status] [varchar](100) NULL,
	[order_datetime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[order_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[products]    Script Date: 22-01-2024 17:28:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[products](
	[product_id] [int] IDENTITY(1,1) NOT NULL,
	[product_name] [varchar](100) NOT NULL,
	[catagory] [varchar](100) NULL,
	[description_text] [varchar](150) NULL,
	[quantity_in_stock] [int] NULL,
	[reorder_level] [int] NULL,
	[prize] [int] NULL,
	[add_datetime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[product_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[suppliers]    Script Date: 22-01-2024 17:28:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[suppliers](
	[supplier_id] [int] IDENTITY(1,1) NOT NULL,
	[supplier_name] [varchar](100) NOT NULL,
	[contact_person] [varchar](100) NULL,
	[phone_number] [varchar](50) NULL,
	[email_id] [varchar](100) NULL,
	[add_datatime] [datetime] NULL,
PRIMARY KEY CLUSTERED 
(
	[supplier_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[warehouses]    Script Date: 22-01-2024 17:28:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[warehouses](
	[wid] [int] IDENTITY(1,1) NOT NULL,
	[warehouse_name] [varchar](100) NOT NULL,
	[current_location] [varchar](100) NOT NULL,
	[capacity] [int] NOT NULL,
	[manager_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[wid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[employees] ON 

INSERT [dbo].[employees] ([eid], [ename], [Contactno], [designation], [salary], [join_date]) VALUES (2, N'John Doe', N'123-456-7890', N'Manager', 60000, CAST(N'2022-01-15' AS Date))
INSERT [dbo].[employees] ([eid], [ename], [Contactno], [designation], [salary], [join_date]) VALUES (3, N'Jane Smith', N'987-654-3210', N'Developer', 50000, CAST(N'2022-02-20' AS Date))
INSERT [dbo].[employees] ([eid], [ename], [Contactno], [designation], [salary], [join_date]) VALUES (4, N'Alice Johnson', N'555-123-4567', N'Analyst', 45000, CAST(N'2022-03-10' AS Date))
INSERT [dbo].[employees] ([eid], [ename], [Contactno], [designation], [salary], [join_date]) VALUES (5, N'Bob Williams', N'111-222-3333', N'Designer', 55000, CAST(N'2022-04-05' AS Date))
INSERT [dbo].[employees] ([eid], [ename], [Contactno], [designation], [salary], [join_date]) VALUES (6, N'Eva Brown', N'999-888-7777', N'Tester', 48000, CAST(N'2022-05-18' AS Date))
SET IDENTITY_INSERT [dbo].[employees] OFF
GO
SET IDENTITY_INSERT [dbo].[order_table] ON 

INSERT [dbo].[order_table] ([order_id], [supplier_id], [total_amount], [order_status], [order_datetime]) VALUES (1, 1, CAST(150.00 AS Decimal(10, 2)), N'Processing', CAST(N'2022-01-15T10:30:00.000' AS DateTime))
INSERT [dbo].[order_table] ([order_id], [supplier_id], [total_amount], [order_status], [order_datetime]) VALUES (2, 1, CAST(200.50 AS Decimal(10, 2)), N'Shipped', CAST(N'2022-02-20T15:45:00.000' AS DateTime))
INSERT [dbo].[order_table] ([order_id], [supplier_id], [total_amount], [order_status], [order_datetime]) VALUES (3, 1, CAST(75.25 AS Decimal(10, 2)), N'Delivered', CAST(N'2022-03-10T08:15:00.000' AS DateTime))
INSERT [dbo].[order_table] ([order_id], [supplier_id], [total_amount], [order_status], [order_datetime]) VALUES (4, 1, CAST(300.75 AS Decimal(10, 2)), N'Processing', CAST(N'2022-04-05T12:00:00.000' AS DateTime))
INSERT [dbo].[order_table] ([order_id], [supplier_id], [total_amount], [order_status], [order_datetime]) VALUES (5, 1, CAST(180.00 AS Decimal(10, 2)), N'Shipped', CAST(N'2022-05-18T14:20:00.000' AS DateTime))
SET IDENTITY_INSERT [dbo].[order_table] OFF
GO
SET IDENTITY_INSERT [dbo].[products] ON 

INSERT [dbo].[products] ([product_id], [product_name], [catagory], [description_text], [quantity_in_stock], [reorder_level], [prize], [add_datetime]) VALUES (2, N'TV', N'Electronics', N'LCD TV', 200, 5, 50000, CAST(N'2024-01-19T14:14:30.100' AS DateTime))
INSERT [dbo].[products] ([product_id], [product_name], [catagory], [description_text], [quantity_in_stock], [reorder_level], [prize], [add_datetime]) VALUES (3, N'shirt', N'Clothing', N'formal shirt', 1000, 10, 500, CAST(N'2024-01-19T14:14:30.100' AS DateTime))
INSERT [dbo].[products] ([product_id], [product_name], [catagory], [description_text], [quantity_in_stock], [reorder_level], [prize], [add_datetime]) VALUES (4, N'alt', N'Home Goods', N'tata salt', 2000, 100, 50, CAST(N'2024-01-19T14:14:30.100' AS DateTime))
INSERT [dbo].[products] ([product_id], [product_name], [catagory], [description_text], [quantity_in_stock], [reorder_level], [prize], [add_datetime]) VALUES (5, N'washing machine', N'Electronics', N'Washing machine', 200, 5, 20000, CAST(N'2024-01-19T14:14:30.100' AS DateTime))
INSERT [dbo].[products] ([product_id], [product_name], [catagory], [description_text], [quantity_in_stock], [reorder_level], [prize], [add_datetime]) VALUES (6, N'rich dad poor dad', N'Books', N'intrsting book to read', 200, 5, 1000, CAST(N'2024-01-19T14:14:30.100' AS DateTime))
INSERT [dbo].[products] ([product_id], [product_name], [catagory], [description_text], [quantity_in_stock], [reorder_level], [prize], [add_datetime]) VALUES (7, N'TV', N'Electronics', N'LCD TV', 200, 5, 50000, CAST(N'2024-01-19T14:37:26.513' AS DateTime))
INSERT [dbo].[products] ([product_id], [product_name], [catagory], [description_text], [quantity_in_stock], [reorder_level], [prize], [add_datetime]) VALUES (8, N'shirt', N'Clothing', N'formal shirt', 1000, 10, 500, CAST(N'2024-01-19T14:37:26.513' AS DateTime))
INSERT [dbo].[products] ([product_id], [product_name], [catagory], [description_text], [quantity_in_stock], [reorder_level], [prize], [add_datetime]) VALUES (9, N'alt', N'Home Goods', N'tata salt', 2000, 100, 50, CAST(N'2024-01-19T14:37:26.513' AS DateTime))
INSERT [dbo].[products] ([product_id], [product_name], [catagory], [description_text], [quantity_in_stock], [reorder_level], [prize], [add_datetime]) VALUES (10, N'washing machine', N'Electronics', N'Washing machine', 200, 5, 20000, CAST(N'2024-01-19T14:37:26.513' AS DateTime))
INSERT [dbo].[products] ([product_id], [product_name], [catagory], [description_text], [quantity_in_stock], [reorder_level], [prize], [add_datetime]) VALUES (11, N'rich dad poor dad', N'Books', N'intrsting book to read', 200, 5, 1000, CAST(N'2024-01-19T14:37:26.513' AS DateTime))
SET IDENTITY_INSERT [dbo].[products] OFF
GO
SET IDENTITY_INSERT [dbo].[suppliers] ON 

INSERT [dbo].[suppliers] ([supplier_id], [supplier_name], [contact_person], [phone_number], [email_id], [add_datatime]) VALUES (1, N'gada electronics', N'jathalal', N'111-111-111', N'jathlala@no1.com', CAST(N'2024-01-19T14:37:26.517' AS DateTime))
INSERT [dbo].[suppliers] ([supplier_id], [supplier_name], [contact_person], [phone_number], [email_id], [add_datatime]) VALUES (2, N'ramesh Cloth', N'rameshhai', N'222-222-222', N'ramesh@gmail.com', CAST(N'2024-01-19T14:37:26.517' AS DateTime))
INSERT [dbo].[suppliers] ([supplier_id], [supplier_name], [contact_person], [phone_number], [email_id], [add_datatime]) VALUES (3, N'tata goods', N'ratan tata', N'777-777-777', N'tatagood@gmail.com', CAST(N'2024-01-19T14:37:26.517' AS DateTime))
INSERT [dbo].[suppliers] ([supplier_id], [supplier_name], [contact_person], [phone_number], [email_id], [add_datatime]) VALUES (4, N'amazon', N'bill gates', N'333-333-333', N'amazon@gmail.com', CAST(N'2024-01-19T14:37:26.517' AS DateTime))
SET IDENTITY_INSERT [dbo].[suppliers] OFF
GO
SET IDENTITY_INSERT [dbo].[warehouses] ON 

INSERT [dbo].[warehouses] ([wid], [warehouse_name], [current_location], [capacity], [manager_id]) VALUES (1, N'Warehouse A', N'Location A', 10000, 4)
INSERT [dbo].[warehouses] ([wid], [warehouse_name], [current_location], [capacity], [manager_id]) VALUES (2, N'Warehouse B', N'Location B', 15000, 2)
INSERT [dbo].[warehouses] ([wid], [warehouse_name], [current_location], [capacity], [manager_id]) VALUES (3, N'Warehouse C', N'Location C', 12000, 3)
SET IDENTITY_INSERT [dbo].[warehouses] OFF
GO
ALTER TABLE [dbo].[order_table]  WITH CHECK ADD FOREIGN KEY([supplier_id])
REFERENCES [dbo].[suppliers] ([supplier_id])
GO
USE [master]
GO
ALTER DATABASE [inventory_management] SET  READ_WRITE 
GO

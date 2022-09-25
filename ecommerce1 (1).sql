-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 25-Set-2022 às 22:24
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `ecommerce1`
--
CREATE DATABASE IF NOT EXISTS `ecommerce1` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `ecommerce1`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `admins`
--

CREATE TABLE `admins` (
  `Nome` varchar(50) NOT NULL,
  `Usuario` varchar(30) NOT NULL,
  `Senha` varchar(30) NOT NULL,
  `IDAdm` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `admins`
--

INSERT INTO `admins` (`Nome`, `Usuario`, `Senha`, `IDAdm`) VALUES
('otbox', 'legal', '12345', 1),
('Luan', 'Br0dt5', 'paçoca', 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `categorias`
--

CREATE TABLE `categorias` (
  `IDCategoria` int(11) NOT NULL,
  `Categoria` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `categorias`
--

INSERT INTO `categorias` (`IDCategoria`, `Categoria`) VALUES
(2, 'lewgal'),
(3, 'Hardware');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `IDCliente` int(11) NOT NULL,
  `CPF` varchar(20) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Endereco` varchar(60) NOT NULL,
  `CEP` varchar(20) NOT NULL,
  `Telefone` varchar(20) NOT NULL,
  `Cidade` varchar(40) NOT NULL,
  `Estado` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`IDCliente`, `CPF`, `Nome`, `Endereco`, `CEP`, `Telefone`, `Cidade`, `Estado`) VALUES
(1, '123', 'otaviu', 'aewda', '132', '123', 'dwawdaw', 'sy'),
(4, 'a', 'a', 'a', 'a', 'a', 'a', 'a'),
(5, '66666666', 'Norberto Careca Legal', 'Rua de nos todos ', '00000000', '1166666666', 'Cabeça', 'CC');

-- --------------------------------------------------------

--
-- Estrutura da tabela `detalhesvenda`
--

CREATE TABLE `detalhesvenda` (
  `IDVenda` int(11) NOT NULL,
  `IDVendedor` int(11) NOT NULL,
  `IDProduto` int(11) NOT NULL,
  `Preco` decimal(10,0) NOT NULL,
  `Qnt` int(11) DEFAULT NULL,
  `Tipovenda` varchar(20) DEFAULT NULL,
  `desconto` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `detalhesvenda`
--

INSERT INTO `detalhesvenda` (`IDVenda`, `IDVendedor`, `IDProduto`, `Preco`, `Qnt`, `Tipovenda`, `desconto`) VALUES
(30, 5, 1, '123', 2, 'Débito', '0.00'),
(30, 5, 5, '2', 2, 'Débito', '0.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fornecedores`
--

CREATE TABLE `fornecedores` (
  `IDFornecedores` int(11) NOT NULL,
  `Endereco` varchar(100) NOT NULL,
  `Contato` varchar(30) NOT NULL,
  `Cnpj` varchar(25) NOT NULL,
  `FEmpresa` varchar(40) NOT NULL,
  `CEP` varchar(12) NOT NULL,
  `Estado` char(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `fornecedores`
--

INSERT INTO `fornecedores` (`IDFornecedores`, `Endereco`, `Contato`, `Cnpj`, `FEmpresa`, `CEP`, `Estado`) VALUES
(1, ' aa', ' a', ' aa', 'a', ' aa', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `IDProduto` int(11) NOT NULL,
  `Preco` decimal(10,0) NOT NULL,
  `Descricao` varchar(50) NOT NULL,
  `Qnt` int(11) NOT NULL,
  `CodCategoria` int(11) NOT NULL,
  `IDFornecedores` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`IDProduto`, `Preco`, `Descricao`, `Qnt`, `CodCategoria`, `IDFornecedores`) VALUES
(1, '123', 'geladeira', 2, 3, NULL),
(4, '1', 'a', 1, 2, NULL),
(5, '2', 'Arduino', 100, 3, NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `transportadora`
--

CREATE TABLE `transportadora` (
  `IDTransporte` int(11) NOT NULL,
  `NumRastreamento` varchar(100) NOT NULL,
  `TEmpresa` varchar(20) NOT NULL,
  `Cnpj` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `transportadora`
--

INSERT INTO `transportadora` (`IDTransporte`, `NumRastreamento`, `TEmpresa`, `Cnpj`) VALUES
(3, 'te', 'te', 'te');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuarios`
--

CREATE TABLE `usuarios` (
  `IDFornecedores` int(11) DEFAULT NULL,
  `IDCliente` int(11) DEFAULT NULL,
  `Usuario` varchar(40) NOT NULL,
  `senha` varchar(30) DEFAULT NULL,
  `Tipo` char(1) DEFAULT NULL,
  `DataInicio` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendas`
--

CREATE TABLE `vendas` (
  `IDVenda` int(11) NOT NULL,
  `IDCliente` int(11) NOT NULL,
  `Totalpreco` double NOT NULL,
  `DataCompra` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `vendas`
--

INSERT INTO `vendas` (`IDVenda`, `IDCliente`, `Totalpreco`, `DataCompra`) VALUES
(30, 5, 250, '2022-09-25');

-- --------------------------------------------------------

--
-- Estrutura da tabela `vendedores`
--

CREATE TABLE `vendedores` (
  `IDVendedor` int(11) NOT NULL,
  `Nome` varchar(40) NOT NULL,
  `senha` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `vendedores`
--

INSERT INTO `vendedores` (`IDVendedor`, `Nome`, `senha`) VALUES
(2, 'Norberto ', '12345678'),
(4, 'administrador', 'password'),
(5, 'Eliana', '4545');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `admins`
--
ALTER TABLE `admins`
  ADD PRIMARY KEY (`IDAdm`),
  ADD UNIQUE KEY `Usuario` (`Usuario`);

--
-- Índices para tabela `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`IDCategoria`);

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`IDCliente`),
  ADD UNIQUE KEY `CPF` (`CPF`);

--
-- Índices para tabela `detalhesvenda`
--
ALTER TABLE `detalhesvenda`
  ADD KEY `IDVendedor` (`IDVendedor`),
  ADD KEY `IDProduto` (`IDProduto`),
  ADD KEY `IDVenda` (`IDVenda`);

--
-- Índices para tabela `fornecedores`
--
ALTER TABLE `fornecedores`
  ADD PRIMARY KEY (`IDFornecedores`),
  ADD UNIQUE KEY `Cnpj` (`Cnpj`);

--
-- Índices para tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`IDProduto`),
  ADD KEY `CodCategoria` (`CodCategoria`),
  ADD KEY `Produtos_ibfk_2` (`IDFornecedores`);

--
-- Índices para tabela `transportadora`
--
ALTER TABLE `transportadora`
  ADD PRIMARY KEY (`IDTransporte`),
  ADD UNIQUE KEY `Cnpj` (`Cnpj`);

--
-- Índices para tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD UNIQUE KEY `IDFornecedores` (`IDFornecedores`),
  ADD UNIQUE KEY `IDCliente` (`IDCliente`);

--
-- Índices para tabela `vendas`
--
ALTER TABLE `vendas`
  ADD PRIMARY KEY (`IDVenda`),
  ADD KEY `IDCliente` (`IDCliente`);

--
-- Índices para tabela `vendedores`
--
ALTER TABLE `vendedores`
  ADD PRIMARY KEY (`IDVendedor`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `admins`
--
ALTER TABLE `admins`
  MODIFY `IDAdm` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `categorias`
--
ALTER TABLE `categorias`
  MODIFY `IDCategoria` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `IDCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `fornecedores`
--
ALTER TABLE `fornecedores`
  MODIFY `IDFornecedores` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `produtos`
--
ALTER TABLE `produtos`
  MODIFY `IDProduto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `transportadora`
--
ALTER TABLE `transportadora`
  MODIFY `IDTransporte` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `vendas`
--
ALTER TABLE `vendas`
  MODIFY `IDVenda` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de tabela `vendedores`
--
ALTER TABLE `vendedores`
  MODIFY `IDVendedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `detalhesvenda`
--
ALTER TABLE `detalhesvenda`
  ADD CONSTRAINT `detalhesvenda_ibfk_1` FOREIGN KEY (`IDVendedor`) REFERENCES `vendedores` (`IDVendedor`),
  ADD CONSTRAINT `detalhesvenda_ibfk_2` FOREIGN KEY (`IDProduto`) REFERENCES `produtos` (`IDProduto`),
  ADD CONSTRAINT `detalhesvenda_ibfk_3` FOREIGN KEY (`IDVenda`) REFERENCES `vendas` (`IDVenda`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Limitadores para a tabela `produtos`
--
ALTER TABLE `produtos`
  ADD CONSTRAINT `Produtos_ibfk_1` FOREIGN KEY (`CodCategoria`) REFERENCES `categorias` (`IDCategoria`),
  ADD CONSTRAINT `Produtos_ibfk_2` FOREIGN KEY (`IDFornecedores`) REFERENCES `fornecedores` (`IDFornecedores`);

--
-- Limitadores para a tabela `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `Usuarios_ibfk_1` FOREIGN KEY (`IDFornecedores`) REFERENCES `fornecedores` (`IDFornecedores`),
  ADD CONSTRAINT `Usuarios_ibfk_2` FOREIGN KEY (`IDCliente`) REFERENCES `cliente` (`IDCliente`);

--
-- Limitadores para a tabela `vendas`
--
ALTER TABLE `vendas`
  ADD CONSTRAINT `vendas_ibfk_1` FOREIGN KEY (`IDCliente`) REFERENCES `cliente` (`IDCliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

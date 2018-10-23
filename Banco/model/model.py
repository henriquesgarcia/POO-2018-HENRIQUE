class Conta():

    def __init__(self, titular, senha, numero):
        self.numero = numero
        self.saldo = 0.0
        self.titular = titular
        self.senha = senha
        self.agencia = '001'


    def depositar(self, valor):
        if valor >= 10 and valor <= 3000:
            self.saldo += valor
            return True
        else:
            return False

    def sacar(self,valor):
        pass

    def transferir(self, outra_conta, valor):
        pass


class Titular():

    def __init__(self, nome, cpf):
        self.nome = nome
        self.cpf = cpf


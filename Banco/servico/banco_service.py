class Banco():

    def __init__(self, nome):
        self.contas = []
        self.nome = nome


    def nova_conta(self, nome_titular, cpf_titular, senha_conta, deposito_inicial = 0):
        pass

    def depositar(self, numero_conta, valor):
        for conta in self.contas:
            if conta.numero == numero_conta:
                return conta.depositar(valor)
        return False


    # def redefinir_senha(self, conta, senha_atual, nova_senha):
    #     pass
from servico.banco_service import Banco


def main():

    banco = Banco('NuBank')
    conta_logada = None

    
    menu = '\n*** BANCO ***\n' \
           '1 - Abrir Conta\n' \
           '2 - Depositar via Envelope\n' \
           '0 - Fechar\n-> '

    while True:
        opcao = int(input(menu))

        if opcao == 1: # abrir conta
            cpf = input('CPF: ')
            nome = input('Nome: ')
            senha = input('Senha: ')
            confirmacao_senha = input('Confirmação de senha: ')

            if senha == confirmacao_senha:
                banco.nova_conta(nome, cpf, senha)
                print('Conta aberta com sucesso.')
            else:
                print('Dados Inválidos!!!')

        if opcao == 2:
            numero_conta = int(input('Número da Conta: '))
            valor = float(input('Valor R$: '))
            if banco.depositar(numero_conta, valor):
                print('Depósito realizado')
            else:
                print('Depósito não realizado')
            # for conta in banco.contas:
            #     if conta.numero == numero_conta:
            #         conta.depositar(valor)


        if opcao == 0:
            break


if __name__ == '__main__':
    main()
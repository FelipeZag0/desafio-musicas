# Minhas Músicas - Gerenciador de Áudio

## Descrição do Projeto
O **Minhas Músicas** é um sistema Java para gerenciar e classificar conteúdos de áudio (músicas e podcasts). Ele permite:
- Registrar reproduções e curtidas
- Calcular classificações automáticas
- Gerar fichas técnicas detalhadas
- Organizar preferências com base em popularidade

## Tecnologias Utilizadas
- **Linguagem**: Java 11+
- **Ferramentas**: JDK, JRE, IDE compatível (Eclipse/IntelliJ/VSCode)

## Como Instalar e Rodar o Projeto
1. Clone o repositório:
   ```bash
   git clone https://github.com/FelipeZag0/desafio-musicas.git
   ```
2. Compile os arquivos Java:
   ```bash
   cd desafio-musicas/src
   javac br/com/alura/minhasmusicas/principal/Principal.java
   ```
3. Execute o programa:
   ```bash
   java br.com.alura.minhasmusicas.principal.Principal
   ```

## Como Usar o Projeto
### Criar uma música:
```java
Musica minhaMusica = new Musica();
minhaMusica.setTitulo("Nome da Música");
minhaMusica.setArtista("Artista");
minhaMusica.setDuracao(3, 30); // 3 minutos e 30 segundos
```

### Simular reproduções e curtidas:
```java
minhaMusica.reproduz(); // Adiciona uma reprodução
minhaMusica.curte();    // Adiciona uma curtida
```

### Gerar ficha técnica:
```java
minhaMusica.exibirFicha();
```

### Adicionar às preferidas:
```java
MinhasPreferidas preferidas = new MinhasPreferidas();
preferidas.inclui(minhaMusica);
```

## Estrutura do Projeto
```
src/
└── br/
    └── com/
        └── alura/
            └── minhasmusicas/
                ├── principal/
                │   └── Principal.java         # Ponto de entrada
                └── modelos/
                    ├── Audio.java             # Classe base
                    ├── Musica.java            # Modelo de músicas
                    ├── Podcast.java           # Modelo de podcasts
                    └── MinhasPreferidas.java  # Gerenciador de favoritos
```
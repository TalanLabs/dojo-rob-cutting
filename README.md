# Rob cutting problems


### Description

Étant donné une tige de longueur `n` et une liste de prix de tige de longueur `i`, où `1 <= i <= n`, 
trouvez la manière optimale de couper la tige en tiges plus petites pour maximiser le profit.

Par exemple, considérez les longueurs et valeurs de tige suivantes :

**Input** :
```text 
length[] = [1, 2, 3, 4, 5, 6, 7, 8]
price[] = [1, 5, 8, 9, 10, 17, 17, 20]
 
rod_length = 4
```

**Best**:
Coupez la tige en deux morceaux de longueur `2` chacun pour gagner un revenu de `5 + 5 = 10`

**Explication**:

|  cut    | profit                  |
|:-------:|:-----------------------:|
| 4       |  9                      |
| 1, 3    |  (1 + 8) = 9            |
| 2, 2    |  (5 + 5) = 10           |
| 3, 1    |  (8 + 1) = 9            |
| 1, 1, 2 | (1 + 1 + 5) = 7         |
| 1, 2, 1 | (1 + 5 + 1) = 7         |
| 2, 1, 1 | (5 + 1 + 1) = 7         |
| 1, 1, 1, 1 | (1 + 1 + 1 + 1) = 4  |

### Instruction

Implémenter la function `cuttingRob` qui retourne le profit maximun. 

La function `cuttingRob` prend deux paramètres:

- `n`:  une longeur de la tige (type `int`)  
- `prices`: la liste de prix par longeur (type `[]int`)

*On pourra assumer que `len(prices)` est toujours supérieur ou égale à longeurs `n`.*

**exemple**:

```python

prices = [1, 5, 8, 9, 10, 17, 17, 20]
n = 4

cuttingRob(prices, n) # should return 10

```

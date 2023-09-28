
const { cutting } = require('./cutting_rod.js')


describe('cutting rod', () => {
    it('test case 1', () => {
      const prices = [1, 1, 1, 1, 1, 1, 1, 1]
      const maxProfit = cutting(prices, 4)
      expect(maxProfit).toBe(4)
    })
    
    it('test case 2', () => {
      const prices = [1, 5, 8, 9, 10, 17, 17, 20]
      const maxProfit = cutting(prices, 1)
      expect(maxProfit).toBe(1)
    })
    
    it('test case 3', () => {
      const prices = [1, 5, 8, 9, 10, 17, 17, 20]
      const maxProfit = cutting(prices, 4)
      expect(maxProfit).toBe(10)
    })

    it('test case 4', () => {
      const prices = [1, 5, 8, 9, 10, 17, 17, 20]
      const maxProfit = cutting(prices, 5)
      expect(maxProfit).toBe(13)
    })
    
    it('test case 5', () => {
      const prices = [1, 5, 8, 9, 10, 17, 17, 20]
      const maxProfit = cutting(prices, 8)
      expect(maxProfit).toBe(22)
    })

    it('test case 6', () => {
      const prices = [1, 5, 8, 9, 10, 17, 17, 20, 30, 40, 50, 60, 70]
      const maxProfit = cutting(prices, 10)
      expect(maxProfit).toBe(40)
    })
    
    it('test case 7', () => {
      const prices = [1, 5, 8, 9, 10, 17, 17, 20, 30, 40, 50, 60, 70]
      const maxProfit = cutting(prices, 12)
      expect(maxProfit).toBe(60)
    })
    
    it('test case 8', () => {
      const prices = [1, 5, 8, 9, 10, 17, 17, 20, 21]
      const maxProfit = cutting(prices, 9)
      expect(maxProfit).toBe(25)
    })

    it('test case 9', () => {
        const prices = [...Array(19).keys()].map(x => x+1)
      const maxProfit = cutting(prices, 19)
      expect(maxProfit).toBe(19)
    })

  
    it.skip('test case 10', () => {
        const prices = [...Array(100).keys()]
          .map(x => x + 1)
          .map(x => x % 2 == 0 ? Math.floor( x / 2): Math.floor(x / 3))
      const maxProfit = cutting(prices, 99)
      expect(maxProfit).toBe(49)
    })
})



import axios from 'axios';
import { useEffect, useState } from 'react';
import Chart from 'react-apexcharts';
import { SaleSum } from 'types/sale';
import { BASE_URL } from 'utils/requests';

type ChartData = {
  series: number[];
  labels: string[];
}

function DonutChart() {
  const [chartData, setChartData] = useState<ChartData>({ labels: [], series: [] });
  useEffect(() => {
    axios.get(`${BASE_URL}/sales/sum-by-client`)
      .then(response => {
        const data = response.data as SaleSum[];
        const myLabels = data.map(x => x.clientName);
        const mySeries = data.map(x => x.sum);
        setChartData({ labels: myLabels, series: mySeries });
      });
  }, []);

  //FORMA ERRADA 
  //let chartData: ChartData = { labels: [], series: [] };
  //o IDEAL E USAR HOOKS
  //const mockData = {
  //  series: [477138, 499928, 444867, 220426, 473088],
  //  labels: ['Anakin', 'Barry Allen', 'Kal-El', 'Logan', 'Padmé']
  //}

  const options = {
    legend: {
      show: true
    }
  }

  return (
    <Chart
      options={{ ...options, labels: chartData.labels }}
      series={chartData.series}
      type="donut"
      height="240"
    />

  );
}

export default DonutChart;
import NavBar from "components/NavBar";
import Footer from "components/Footer";
import DataTable from "components/DataTable";
import BarChart from "components/BarChart";
import DonutChart from "components/DonutChart";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Dashboard</h1>
        <br />
        <div className="text-center">
          <h2 className="text-primary">All Live Movimentations</h2>
        </div>
        <DataTable />
        <br />
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Movimentation Pieces</h5>
            <DonutChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Success Rate (%)</h5>
            <BarChart />
          </div>
        </div>
      </div>
      <br />
      <Footer />
    </>
  );
}

export default App;

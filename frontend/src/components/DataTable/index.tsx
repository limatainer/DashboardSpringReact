import axios from "axios";
import Pagination from "components/Pagination";
import { useEffect, useState } from "react";
import { SalePage } from "types/sale";
import { formatLocalDate } from "utils/format";
import { BASE_URL } from "utils/requests";

function DataTable() {
  const [page, setPage] = useState<SalePage>({
    first: true,
    last: true,
    number: 0,
    totalElements: 0,
    totalPages: 0
  });

  useEffect(() => {
    axios.get(`${BASE_URL}/sales?page=0&size=20&sort=date,desc`)
      .then(response => {
        setPage(response.data);
      });
  }, []);

  return (
    <>
      <br />
      <Pagination page={page} />
      <div className="table-responsive">
        <table className="table table-striped table-hover table-sm">
          <thead>
            <tr className="table-warning">
              <th>Last Visit</th>
              <th>Client</th>
              <th>Visits</th>
              <th>Trainings</th>
              <th>Total Price</th>
            </tr>
          </thead>
          <tbody>
            {page.content?.map(item =>
            (<tr key={item.id}>
              <td>{formatLocalDate(item.date, "dd/MM/yyyy")}</td>
              <td>{item.client.name}</td>
              <td>{item.visits}</td>
              <td>{item.trainings}</td>
              <td>{item.price.toFixed(2)}</td>
            </tr>
            )
            )}
          </tbody>
        </table>
      </div>
    </>


  );
}

export default DataTable;
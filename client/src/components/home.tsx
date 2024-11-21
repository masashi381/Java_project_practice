import axios from "axios";
import React, { useEffect, useState } from "react";
import { Link } from "react-router-dom";

type DataProps = {
  title: string;
  body: string;
  id: number;
};
const Home: React.FC = () => {
  const [fetchedData, setFetchedData] = useState<DataProps[]>([]);
  useEffect(() => {
    const getData = async () => {
      const res = await axios.get("http://localhost:8080/api/");
      console.log("res: ", res.data);
      setFetchedData(res.data);
    };
    getData();
  }, []);

  console.log("data: ", fetchedData);
  return (
    <>
      <div>
        {fetchedData.map((data) => (
          <div key={data.id} className="flex border w-64">
            <h2 className="mr-4">{data.title}</h2>
            <p>{data.body}</p>
          </div>
        ))}
      </div>
      <div className="w-24 mt-2 ml-9">
        <button className="border px-2 border-blue-400 ">
          <Link to="/post">Go to Post</Link>
        </button>
      </div>
    </>
  );
};

export default Home;

import axios from "axios";
import React, { useEffect, useState } from "react";

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
  return fetchedData.map((data) => {
    return (
      <div key={data.id} className="flex border w-72">
        <h2 className="mr-5">{data.title}</h2>
        <p>{data.body}</p>
      </div>
    );
  });
};

export default Home;

import axios from "axios";
import React from "react";
import { Link } from "react-router-dom";

const Post: React.FC = () => {
  return (
    <>
      <div>
        <h1 className="text-2xl">Post page</h1>
        <button className="border px-2 border-blue-400 ">
          <Link to="/">Go Home</Link>
        </button>
      </div>
    </>
  );
};

export default Post;

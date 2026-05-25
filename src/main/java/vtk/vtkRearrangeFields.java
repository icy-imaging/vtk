// java wrapper for vtkRearrangeFields object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRearrangeFields extends vtkDataSetAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native int AddOperation_4(int id0,int id1,int id2,int id3);
  public int AddOperation(int id0,int id1,int id2,int id3)
  {
    return AddOperation_4(id0,id1,id2,id3);
  }

  private native int AddOperation_5(int id0,byte[] id1, int len1,int id2,int id3);
  public int AddOperation(int id0,String id1,int id2,int id3)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return AddOperation_5(id0,bytes1, bytes1.length,id2,id3);
  }

  private native int AddOperation_6(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,byte[] id3, int len3);
  public int AddOperation(String id0,String id1,String id2,String id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    return AddOperation_6(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,bytes3, bytes3.length);
  }

  private native int RemoveOperation_7(int id0);
  public int RemoveOperation(int id0)
  {
    return RemoveOperation_7(id0);
  }

  private native int RemoveOperation_8(int id0,int id1,int id2,int id3);
  public int RemoveOperation(int id0,int id1,int id2,int id3)
  {
    return RemoveOperation_8(id0,id1,id2,id3);
  }

  private native int RemoveOperation_9(int id0,byte[] id1, int len1,int id2,int id3);
  public int RemoveOperation(int id0,String id1,int id2,int id3)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return RemoveOperation_9(id0,bytes1, bytes1.length,id2,id3);
  }

  private native int RemoveOperation_10(byte[] id0, int len0,byte[] id1, int len1,byte[] id2, int len2,byte[] id3, int len3);
  public int RemoveOperation(String id0,String id1,String id2,String id3)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    byte[] bytes3 = id3.getBytes(StandardCharsets.UTF_8);
    return RemoveOperation_10(bytes0, bytes0.length,bytes1, bytes1.length,bytes2, bytes2.length,bytes3, bytes3.length);
  }

  private native void RemoveAllOperations_11();
  public void RemoveAllOperations()
  {
    RemoveAllOperations_11();
  }

  public vtkRearrangeFields() { super(); }

  public vtkRearrangeFields(long id) { super(id); }
  public native long   VTKInit();

}

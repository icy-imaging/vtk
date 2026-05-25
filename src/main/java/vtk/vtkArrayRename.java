// java wrapper for vtkArrayRename object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkArrayRename extends vtkPassInputTypeAlgorithm
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

  private native int GetNumberOfArrays_4(int id0);
  public int GetNumberOfArrays(int id0)
  {
    return GetNumberOfArrays_4(id0);
  }

  private native byte[] GetArrayOriginalName_5(int id0,int id1);
  public String GetArrayOriginalName(int id0,int id1)
  {
    return new String(GetArrayOriginalName_5(id0,id1), StandardCharsets.UTF_8);
  }

  private native byte[] GetArrayNewName_6(int id0,int id1);
  public String GetArrayNewName(int id0,int id1)
  {
    return new String(GetArrayNewName_6(id0,id1), StandardCharsets.UTF_8);
  }

  private native void SetArrayName_7(int id0,int id1,byte[] id2, int len2);
  public void SetArrayName(int id0,int id1,String id2)
  {
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetArrayName_7(id0,id1,bytes2, bytes2.length);
  }

  private native void SetArrayName_8(int id0,byte[] id1, int len1,byte[] id2, int len2);
  public void SetArrayName(int id0,String id1,String id2)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    byte[] bytes2 = id2.getBytes(StandardCharsets.UTF_8);
    SetArrayName_8(id0,bytes1, bytes1.length,bytes2, bytes2.length);
  }

  private native void ClearMapping_9(int id0);
  public void ClearMapping(int id0)
  {
    ClearMapping_9(id0);
  }

  private native int GetNumberOfPointArrays_10();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_10();
  }

  private native byte[] GetPointArrayOriginalName_11(int id0);
  public String GetPointArrayOriginalName(int id0)
  {
    return new String(GetPointArrayOriginalName_11(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetPointArrayNewName_12(int id0);
  public String GetPointArrayNewName(int id0)
  {
    return new String(GetPointArrayNewName_12(id0), StandardCharsets.UTF_8);
  }

  private native void SetPointArrayName_13(int id0,byte[] id1, int len1);
  public void SetPointArrayName(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetPointArrayName_13(id0,bytes1, bytes1.length);
  }

  private native void SetPointArrayName_14(byte[] id0, int len0,byte[] id1, int len1);
  public void SetPointArrayName(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetPointArrayName_14(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void ClearPointMapping_15();
  public void ClearPointMapping()
  {
    ClearPointMapping_15();
  }

  private native int GetNumberOfCellArrays_16();
  public int GetNumberOfCellArrays()
  {
    return GetNumberOfCellArrays_16();
  }

  private native byte[] GetCellArrayOriginalName_17(int id0);
  public String GetCellArrayOriginalName(int id0)
  {
    return new String(GetCellArrayOriginalName_17(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetCellArrayNewName_18(int id0);
  public String GetCellArrayNewName(int id0)
  {
    return new String(GetCellArrayNewName_18(id0), StandardCharsets.UTF_8);
  }

  private native void SetCellArrayName_19(int id0,byte[] id1, int len1);
  public void SetCellArrayName(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetCellArrayName_19(id0,bytes1, bytes1.length);
  }

  private native void SetCellArrayName_20(byte[] id0, int len0,byte[] id1, int len1);
  public void SetCellArrayName(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetCellArrayName_20(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void ClearCellMapping_21();
  public void ClearCellMapping()
  {
    ClearCellMapping_21();
  }

  private native int GetNumberOfFieldArrays_22();
  public int GetNumberOfFieldArrays()
  {
    return GetNumberOfFieldArrays_22();
  }

  private native byte[] GetFieldArrayOriginalName_23(int id0);
  public String GetFieldArrayOriginalName(int id0)
  {
    return new String(GetFieldArrayOriginalName_23(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetFieldArrayNewName_24(int id0);
  public String GetFieldArrayNewName(int id0)
  {
    return new String(GetFieldArrayNewName_24(id0), StandardCharsets.UTF_8);
  }

  private native void SetFieldArrayName_25(int id0,byte[] id1, int len1);
  public void SetFieldArrayName(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetFieldArrayName_25(id0,bytes1, bytes1.length);
  }

  private native void SetFieldArrayName_26(byte[] id0, int len0,byte[] id1, int len1);
  public void SetFieldArrayName(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetFieldArrayName_26(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void ClearFieldMapping_27();
  public void ClearFieldMapping()
  {
    ClearFieldMapping_27();
  }

  private native int GetNumberOfVertexArrays_28();
  public int GetNumberOfVertexArrays()
  {
    return GetNumberOfVertexArrays_28();
  }

  private native byte[] GetVertexArrayOriginalName_29(int id0);
  public String GetVertexArrayOriginalName(int id0)
  {
    return new String(GetVertexArrayOriginalName_29(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetVertexArrayNewName_30(int id0);
  public String GetVertexArrayNewName(int id0)
  {
    return new String(GetVertexArrayNewName_30(id0), StandardCharsets.UTF_8);
  }

  private native void SetVertexArrayName_31(int id0,byte[] id1, int len1);
  public void SetVertexArrayName(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetVertexArrayName_31(id0,bytes1, bytes1.length);
  }

  private native void SetVertexArrayName_32(byte[] id0, int len0,byte[] id1, int len1);
  public void SetVertexArrayName(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetVertexArrayName_32(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void ClearVertexMapping_33();
  public void ClearVertexMapping()
  {
    ClearVertexMapping_33();
  }

  private native int GetNumberOfEdgeArrays_34();
  public int GetNumberOfEdgeArrays()
  {
    return GetNumberOfEdgeArrays_34();
  }

  private native byte[] GetEdgeArrayOriginalName_35(int id0);
  public String GetEdgeArrayOriginalName(int id0)
  {
    return new String(GetEdgeArrayOriginalName_35(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetEdgeArrayNewName_36(int id0);
  public String GetEdgeArrayNewName(int id0)
  {
    return new String(GetEdgeArrayNewName_36(id0), StandardCharsets.UTF_8);
  }

  private native void SetEdgeArrayName_37(int id0,byte[] id1, int len1);
  public void SetEdgeArrayName(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetEdgeArrayName_37(id0,bytes1, bytes1.length);
  }

  private native void SetEdgeArrayName_38(byte[] id0, int len0,byte[] id1, int len1);
  public void SetEdgeArrayName(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetEdgeArrayName_38(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void ClearEdgeMapping_39();
  public void ClearEdgeMapping()
  {
    ClearEdgeMapping_39();
  }

  private native int GetNumberOfRowArrays_40();
  public int GetNumberOfRowArrays()
  {
    return GetNumberOfRowArrays_40();
  }

  private native byte[] GetRowArrayOriginalName_41(int id0);
  public String GetRowArrayOriginalName(int id0)
  {
    return new String(GetRowArrayOriginalName_41(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetRowArrayNewName_42(int id0);
  public String GetRowArrayNewName(int id0)
  {
    return new String(GetRowArrayNewName_42(id0), StandardCharsets.UTF_8);
  }

  private native void SetRowArrayName_43(int id0,byte[] id1, int len1);
  public void SetRowArrayName(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetRowArrayName_43(id0,bytes1, bytes1.length);
  }

  private native void SetRowArrayName_44(byte[] id0, int len0,byte[] id1, int len1);
  public void SetRowArrayName(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetRowArrayName_44(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void ClearRowMapping_45();
  public void ClearRowMapping()
  {
    ClearRowMapping_45();
  }

  private native void ClearAll_46();
  public void ClearAll()
  {
    ClearAll_46();
  }

  public vtkArrayRename() { super(); }

  public vtkArrayRename(long id) { super(id); }
  public native long   VTKInit();

}

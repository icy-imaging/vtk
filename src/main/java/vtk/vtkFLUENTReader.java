// java wrapper for vtkFLUENTReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFLUENTReader extends vtkMultiBlockDataSetAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native long GetNumberOfCells_6();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_6();
  }

  private native int GetNumberOfCellArrays_7();
  public int GetNumberOfCellArrays()
  {
    return GetNumberOfCellArrays_7();
  }

  private native byte[] GetCellArrayName_8(int id0);
  public String GetCellArrayName(int id0)
  {
    return new String(GetCellArrayName_8(id0), StandardCharsets.UTF_8);
  }

  private native int GetCellArrayStatus_9(byte[] id0, int len0);
  public int GetCellArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetCellArrayStatus_9(bytes0, bytes0.length);
  }

  private native void SetCellArrayStatus_10(byte[] id0, int len0,int id1);
  public void SetCellArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellArrayStatus_10(bytes0, bytes0.length,id1);
  }

  private native void DisableAllCellArrays_11();
  public void DisableAllCellArrays()
  {
    DisableAllCellArrays_11();
  }

  private native void EnableAllCellArrays_12();
  public void EnableAllCellArrays()
  {
    EnableAllCellArrays_12();
  }

  private native void SetDataByteOrderToBigEndian_13();
  public void SetDataByteOrderToBigEndian()
  {
    SetDataByteOrderToBigEndian_13();
  }

  private native void SetDataByteOrderToLittleEndian_14();
  public void SetDataByteOrderToLittleEndian()
  {
    SetDataByteOrderToLittleEndian_14();
  }

  private native int GetDataByteOrder_15();
  public int GetDataByteOrder()
  {
    return GetDataByteOrder_15();
  }

  private native void SetDataByteOrder_16(int id0);
  public void SetDataByteOrder(int id0)
  {
    SetDataByteOrder_16(id0);
  }

  private native byte[] GetDataByteOrderAsString_17();
  public String GetDataByteOrderAsString()
  {
    return new String(GetDataByteOrderAsString_17(), StandardCharsets.UTF_8);
  }

  public vtkFLUENTReader() { super(); }

  public vtkFLUENTReader(long id) { super(id); }
  public native long   VTKInit();

}

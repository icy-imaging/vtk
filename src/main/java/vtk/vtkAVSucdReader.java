// java wrapper for vtkAVSucdReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAVSucdReader extends vtkUnstructuredGridAlgorithm
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

  private native void SetBinaryFile_6(int id0);
  public void SetBinaryFile(int id0)
  {
    SetBinaryFile_6(id0);
  }

  private native int GetBinaryFile_7();
  public int GetBinaryFile()
  {
    return GetBinaryFile_7();
  }

  private native void BinaryFileOn_8();
  public void BinaryFileOn()
  {
    BinaryFileOn_8();
  }

  private native void BinaryFileOff_9();
  public void BinaryFileOff()
  {
    BinaryFileOff_9();
  }

  private native int GetNumberOfCells_10();
  public int GetNumberOfCells()
  {
    return GetNumberOfCells_10();
  }

  private native int GetNumberOfNodes_11();
  public int GetNumberOfNodes()
  {
    return GetNumberOfNodes_11();
  }

  private native int GetNumberOfNodeFields_12();
  public int GetNumberOfNodeFields()
  {
    return GetNumberOfNodeFields_12();
  }

  private native int GetNumberOfCellFields_13();
  public int GetNumberOfCellFields()
  {
    return GetNumberOfCellFields_13();
  }

  private native int GetNumberOfFields_14();
  public int GetNumberOfFields()
  {
    return GetNumberOfFields_14();
  }

  private native int GetNumberOfNodeComponents_15();
  public int GetNumberOfNodeComponents()
  {
    return GetNumberOfNodeComponents_15();
  }

  private native int GetNumberOfCellComponents_16();
  public int GetNumberOfCellComponents()
  {
    return GetNumberOfCellComponents_16();
  }

  private native void SetByteOrderToBigEndian_17();
  public void SetByteOrderToBigEndian()
  {
    SetByteOrderToBigEndian_17();
  }

  private native void SetByteOrderToLittleEndian_18();
  public void SetByteOrderToLittleEndian()
  {
    SetByteOrderToLittleEndian_18();
  }

  private native byte[] GetByteOrderAsString_19();
  public String GetByteOrderAsString()
  {
    return new String(GetByteOrderAsString_19(), StandardCharsets.UTF_8);
  }

  private native void SetByteOrder_20(int id0);
  public void SetByteOrder(int id0)
  {
    SetByteOrder_20(id0);
  }

  private native int GetByteOrder_21();
  public int GetByteOrder()
  {
    return GetByteOrder_21();
  }

  private native int GetNumberOfPointArrays_22();
  public int GetNumberOfPointArrays()
  {
    return GetNumberOfPointArrays_22();
  }

  private native int GetNumberOfCellArrays_23();
  public int GetNumberOfCellArrays()
  {
    return GetNumberOfCellArrays_23();
  }

  private native byte[] GetPointArrayName_24(int id0);
  public String GetPointArrayName(int id0)
  {
    return new String(GetPointArrayName_24(id0), StandardCharsets.UTF_8);
  }

  private native byte[] GetCellArrayName_25(int id0);
  public String GetCellArrayName(int id0)
  {
    return new String(GetCellArrayName_25(id0), StandardCharsets.UTF_8);
  }

  private native int GetPointArrayStatus_26(byte[] id0, int len0);
  public int GetPointArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetPointArrayStatus_26(bytes0, bytes0.length);
  }

  private native int GetCellArrayStatus_27(byte[] id0, int len0);
  public int GetCellArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetCellArrayStatus_27(bytes0, bytes0.length);
  }

  private native void SetPointArrayStatus_28(byte[] id0, int len0,int id1);
  public void SetPointArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointArrayStatus_28(bytes0, bytes0.length,id1);
  }

  private native void SetCellArrayStatus_29(byte[] id0, int len0,int id1);
  public void SetCellArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellArrayStatus_29(bytes0, bytes0.length,id1);
  }

  private native void DisableAllCellArrays_30();
  public void DisableAllCellArrays()
  {
    DisableAllCellArrays_30();
  }

  private native void EnableAllCellArrays_31();
  public void EnableAllCellArrays()
  {
    EnableAllCellArrays_31();
  }

  private native void DisableAllPointArrays_32();
  public void DisableAllPointArrays()
  {
    DisableAllPointArrays_32();
  }

  private native void EnableAllPointArrays_33();
  public void EnableAllPointArrays()
  {
    EnableAllPointArrays_33();
  }

  public vtkAVSucdReader() { super(); }

  public vtkAVSucdReader(long id) { super(id); }
  public native long   VTKInit();

}

// java wrapper for vtkNetCDFPOPReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkNetCDFPOPReader extends vtkRectilinearGridAlgorithm
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

  private native void SetStride_6(int id0,int id1,int id2);
  public void SetStride(int id0,int id1,int id2)
  {
    SetStride_6(id0,id1,id2);
  }

  private native void SetStride_7(int id0[]);
  public void SetStride(int id0[])
  {
    SetStride_7(id0);
  }

  private native int[] GetStride_8();
  public int[] GetStride()
  {
    return GetStride_8();
  }

  private native int GetNumberOfVariableArrays_9();
  public int GetNumberOfVariableArrays()
  {
    return GetNumberOfVariableArrays_9();
  }

  private native byte[] GetVariableArrayName_10(int id0);
  public String GetVariableArrayName(int id0)
  {
    return new String(GetVariableArrayName_10(id0), StandardCharsets.UTF_8);
  }

  private native int GetVariableArrayStatus_11(byte[] id0, int len0);
  public int GetVariableArrayStatus(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetVariableArrayStatus_11(bytes0, bytes0.length);
  }

  private native void SetVariableArrayStatus_12(byte[] id0, int len0,int id1);
  public void SetVariableArrayStatus(String id0,int id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVariableArrayStatus_12(bytes0, bytes0.length,id1);
  }

  public vtkNetCDFPOPReader() { super(); }

  public vtkNetCDFPOPReader(long id) { super(id); }
  public native long   VTKInit();

}

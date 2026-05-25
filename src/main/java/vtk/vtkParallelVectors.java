// java wrapper for vtkParallelVectors object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParallelVectors extends vtkPolyDataAlgorithm
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

  private native void SetFirstVectorFieldName_4(byte[] id0, int len0);
  public void SetFirstVectorFieldName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFirstVectorFieldName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFirstVectorFieldName_5();
  public String GetFirstVectorFieldName()
  {
    return new String(GetFirstVectorFieldName_5(), StandardCharsets.UTF_8);
  }

  private native void SetSecondVectorFieldName_6(byte[] id0, int len0);
  public void SetSecondVectorFieldName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSecondVectorFieldName_6(bytes0, bytes0.length);
  }

  private native byte[] GetSecondVectorFieldName_7();
  public String GetSecondVectorFieldName()
  {
    return new String(GetSecondVectorFieldName_7(), StandardCharsets.UTF_8);
  }

  public vtkParallelVectors() { super(); }

  public vtkParallelVectors(long id) { super(id); }
  public native long   VTKInit();

}

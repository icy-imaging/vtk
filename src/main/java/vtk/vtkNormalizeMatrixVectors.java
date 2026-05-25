// java wrapper for vtkNormalizeMatrixVectors object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkNormalizeMatrixVectors extends vtkArrayDataAlgorithm
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

  private native int GetVectorDimension_4();
  public int GetVectorDimension()
  {
    return GetVectorDimension_4();
  }

  private native void SetVectorDimension_5(int id0);
  public void SetVectorDimension(int id0)
  {
    SetVectorDimension_5(id0);
  }

  private native double GetPValue_6();
  public double GetPValue()
  {
    return GetPValue_6();
  }

  private native void SetPValue_7(double id0);
  public void SetPValue(double id0)
  {
    SetPValue_7(id0);
  }

  public vtkNormalizeMatrixVectors() { super(); }

  public vtkNormalizeMatrixVectors(long id) { super(id); }
  public native long   VTKInit();

}

// java wrapper for vtkSimpleBondPerceiver object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSimpleBondPerceiver extends vtkMoleculeAlgorithm
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

  private native void SetTolerance_4(float id0);
  public void SetTolerance(float id0)
  {
    SetTolerance_4(id0);
  }

  private native float GetTolerance_5();
  public float GetTolerance()
  {
    return GetTolerance_5();
  }

  private native boolean GetIsToleranceAbsolute_6();
  public boolean GetIsToleranceAbsolute()
  {
    return GetIsToleranceAbsolute_6();
  }

  private native void SetIsToleranceAbsolute_7(boolean id0);
  public void SetIsToleranceAbsolute(boolean id0)
  {
    SetIsToleranceAbsolute_7(id0);
  }

  public vtkSimpleBondPerceiver() { super(); }

  public vtkSimpleBondPerceiver(long id) { super(id); }
  public native long   VTKInit();

}

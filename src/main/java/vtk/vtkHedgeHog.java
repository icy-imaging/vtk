// java wrapper for vtkHedgeHog object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHedgeHog extends vtkPolyDataAlgorithm
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

  private native void SetScaleFactor_4(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_4(id0);
  }

  private native double GetScaleFactor_5();
  public double GetScaleFactor()
  {
    return GetScaleFactor_5();
  }

  private native void SetVectorMode_6(int id0);
  public void SetVectorMode(int id0)
  {
    SetVectorMode_6(id0);
  }

  private native int GetVectorMode_7();
  public int GetVectorMode()
  {
    return GetVectorMode_7();
  }

  private native void SetVectorModeToUseVector_8();
  public void SetVectorModeToUseVector()
  {
    SetVectorModeToUseVector_8();
  }

  private native void SetVectorModeToUseNormal_9();
  public void SetVectorModeToUseNormal()
  {
    SetVectorModeToUseNormal_9();
  }

  private native byte[] GetVectorModeAsString_10();
  public String GetVectorModeAsString()
  {
    return new String(GetVectorModeAsString_10(), StandardCharsets.UTF_8);
  }

  private native void SetOutputPointsPrecision_11(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_11(id0);
  }

  private native int GetOutputPointsPrecision_12();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_12();
  }

  public vtkHedgeHog() { super(); }

  public vtkHedgeHog(long id) { super(id); }
  public native long   VTKInit();

}

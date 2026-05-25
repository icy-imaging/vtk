// java wrapper for vtkFrustumCoverageCuller object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFrustumCoverageCuller extends vtkCuller
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

  private native void SetMinimumCoverage_4(double id0);
  public void SetMinimumCoverage(double id0)
  {
    SetMinimumCoverage_4(id0);
  }

  private native double GetMinimumCoverage_5();
  public double GetMinimumCoverage()
  {
    return GetMinimumCoverage_5();
  }

  private native void SetMaximumCoverage_6(double id0);
  public void SetMaximumCoverage(double id0)
  {
    SetMaximumCoverage_6(id0);
  }

  private native double GetMaximumCoverage_7();
  public double GetMaximumCoverage()
  {
    return GetMaximumCoverage_7();
  }

  private native void SetSortingStyle_8(int id0);
  public void SetSortingStyle(int id0)
  {
    SetSortingStyle_8(id0);
  }

  private native int GetSortingStyleMinValue_9();
  public int GetSortingStyleMinValue()
  {
    return GetSortingStyleMinValue_9();
  }

  private native int GetSortingStyleMaxValue_10();
  public int GetSortingStyleMaxValue()
  {
    return GetSortingStyleMaxValue_10();
  }

  private native int GetSortingStyle_11();
  public int GetSortingStyle()
  {
    return GetSortingStyle_11();
  }

  private native void SetSortingStyleToNone_12();
  public void SetSortingStyleToNone()
  {
    SetSortingStyleToNone_12();
  }

  private native void SetSortingStyleToBackToFront_13();
  public void SetSortingStyleToBackToFront()
  {
    SetSortingStyleToBackToFront_13();
  }

  private native void SetSortingStyleToFrontToBack_14();
  public void SetSortingStyleToFrontToBack()
  {
    SetSortingStyleToFrontToBack_14();
  }

  private native byte[] GetSortingStyleAsString_15();
  public String GetSortingStyleAsString()
  {
    return new String(GetSortingStyleAsString_15(), StandardCharsets.UTF_8);
  }

  public vtkFrustumCoverageCuller() { super(); }

  public vtkFrustumCoverageCuller(long id) { super(id); }
  public native long   VTKInit();

}

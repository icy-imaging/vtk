// java wrapper for vtkImageBSplineInterpolator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageBSplineInterpolator extends vtkAbstractImageInterpolator
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

  private native void SetSplineDegree_4(int id0);
  public void SetSplineDegree(int id0)
  {
    SetSplineDegree_4(id0);
  }

  private native int GetSplineDegree_5();
  public int GetSplineDegree()
  {
    return GetSplineDegree_5();
  }

  private native int GetSplineDegreeMinValue_6();
  public int GetSplineDegreeMinValue()
  {
    return GetSplineDegreeMinValue_6();
  }

  private native int GetSplineDegreeMaxValue_7();
  public int GetSplineDegreeMaxValue()
  {
    return GetSplineDegreeMaxValue_7();
  }

  private native void ComputeSupportSize_8(double id0[],int id1[]);
  public void ComputeSupportSize(double id0[],int id1[])
  {
    ComputeSupportSize_8(id0,id1);
  }

  private native boolean IsSeparable_9();
  public boolean IsSeparable()
  {
    return IsSeparable_9();
  }

  public vtkImageBSplineInterpolator() { super(); }

  public vtkImageBSplineInterpolator(long id) { super(id); }
  public native long   VTKInit();

}

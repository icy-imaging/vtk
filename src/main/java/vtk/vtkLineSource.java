// java wrapper for vtkLineSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLineSource extends vtkPolyDataAlgorithm
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

  private native void SetPoint1_4(double id0,double id1,double id2);
  public void SetPoint1(double id0,double id1,double id2)
  {
    SetPoint1_4(id0,id1,id2);
  }

  private native void SetPoint1_5(double id0[]);
  public void SetPoint1(double id0[])
  {
    SetPoint1_5(id0);
  }

  private native double[] GetPoint1_6();
  public double[] GetPoint1()
  {
    return GetPoint1_6();
  }

  private native void SetPoint1_7(float id0[]);
  public void SetPoint1(float id0[])
  {
    SetPoint1_7(id0);
  }

  private native void SetPoint2_8(double id0,double id1,double id2);
  public void SetPoint2(double id0,double id1,double id2)
  {
    SetPoint2_8(id0,id1,id2);
  }

  private native void SetPoint2_9(double id0[]);
  public void SetPoint2(double id0[])
  {
    SetPoint2_9(id0);
  }

  private native double[] GetPoint2_10();
  public double[] GetPoint2()
  {
    return GetPoint2_10();
  }

  private native void SetPoint2_11(float id0[]);
  public void SetPoint2(float id0[])
  {
    SetPoint2_11(id0);
  }

  private native void SetUseRegularRefinement_12(boolean id0);
  public void SetUseRegularRefinement(boolean id0)
  {
    SetUseRegularRefinement_12(id0);
  }

  private native boolean GetUseRegularRefinement_13();
  public boolean GetUseRegularRefinement()
  {
    return GetUseRegularRefinement_13();
  }

  private native void UseRegularRefinementOn_14();
  public void UseRegularRefinementOn()
  {
    UseRegularRefinementOn_14();
  }

  private native void UseRegularRefinementOff_15();
  public void UseRegularRefinementOff()
  {
    UseRegularRefinementOff_15();
  }

  private native void SetResolution_16(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_16(id0);
  }

  private native int GetResolutionMinValue_17();
  public int GetResolutionMinValue()
  {
    return GetResolutionMinValue_17();
  }

  private native int GetResolutionMaxValue_18();
  public int GetResolutionMaxValue()
  {
    return GetResolutionMaxValue_18();
  }

  private native int GetResolution_19();
  public int GetResolution()
  {
    return GetResolution_19();
  }

  private native void SetNumberOfRefinementRatios_20(int id0);
  public void SetNumberOfRefinementRatios(int id0)
  {
    SetNumberOfRefinementRatios_20(id0);
  }

  private native void SetRefinementRatio_21(int id0,double id1);
  public void SetRefinementRatio(int id0,double id1)
  {
    SetRefinementRatio_21(id0,id1);
  }

  private native int GetNumberOfRefinementRatios_22();
  public int GetNumberOfRefinementRatios()
  {
    return GetNumberOfRefinementRatios_22();
  }

  private native double GetRefinementRatio_23(int id0);
  public double GetRefinementRatio(int id0)
  {
    return GetRefinementRatio_23(id0);
  }

  private native void SetPoints_24(vtkPoints id0);
  public void SetPoints(vtkPoints id0)
  {
    SetPoints_24(id0);
  }

  private native long GetPoints_25();
  public vtkPoints GetPoints()
  {
    long temp = GetPoints_25();

    if (temp == 0) return null;
    return (vtkPoints)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputPointsPrecision_26(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_26(id0);
  }

  private native int GetOutputPointsPrecision_27();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_27();
  }

  public vtkLineSource() { super(); }

  public vtkLineSource(long id) { super(id); }
  public native long   VTKInit();

}

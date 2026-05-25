// java wrapper for vtkHandleRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHandleRepresentation extends vtkWidgetRepresentation
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

  private native void SetDisplayPosition_4(double id0[]);
  public void SetDisplayPosition(double id0[])
  {
    SetDisplayPosition_4(id0);
  }

  private native void GetDisplayPosition_5(double id0[]);
  public void GetDisplayPosition(double id0[])
  {
    GetDisplayPosition_5(id0);
  }

  private native double[] GetDisplayPosition_6();
  public double[] GetDisplayPosition()
  {
    return GetDisplayPosition_6();
  }

  private native void SetWorldPosition_7(double id0[]);
  public void SetWorldPosition(double id0[])
  {
    SetWorldPosition_7(id0);
  }

  private native void GetWorldPosition_8(double id0[]);
  public void GetWorldPosition(double id0[])
  {
    GetWorldPosition_8(id0);
  }

  private native double[] GetWorldPosition_9();
  public double[] GetWorldPosition()
  {
    return GetWorldPosition_9();
  }

  private native void SetTolerance_10(int id0);
  public void SetTolerance(int id0)
  {
    SetTolerance_10(id0);
  }

  private native int GetToleranceMinValue_11();
  public int GetToleranceMinValue()
  {
    return GetToleranceMinValue_11();
  }

  private native int GetToleranceMaxValue_12();
  public int GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_12();
  }

  private native int GetTolerance_13();
  public int GetTolerance()
  {
    return GetTolerance_13();
  }

  private native void SetActiveRepresentation_14(int id0);
  public void SetActiveRepresentation(int id0)
  {
    SetActiveRepresentation_14(id0);
  }

  private native int GetActiveRepresentation_15();
  public int GetActiveRepresentation()
  {
    return GetActiveRepresentation_15();
  }

  private native void ActiveRepresentationOn_16();
  public void ActiveRepresentationOn()
  {
    ActiveRepresentationOn_16();
  }

  private native void ActiveRepresentationOff_17();
  public void ActiveRepresentationOff()
  {
    ActiveRepresentationOff_17();
  }

  private native void SetInteractionState_18(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_18(id0);
  }

  private native int GetInteractionStateMinValue_19();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_19();
  }

  private native int GetInteractionStateMaxValue_20();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_20();
  }

  private native void SetConstrained_21(int id0);
  public void SetConstrained(int id0)
  {
    SetConstrained_21(id0);
  }

  private native int GetConstrained_22();
  public int GetConstrained()
  {
    return GetConstrained_22();
  }

  private native void ConstrainedOn_23();
  public void ConstrainedOn()
  {
    ConstrainedOn_23();
  }

  private native void ConstrainedOff_24();
  public void ConstrainedOff()
  {
    ConstrainedOff_24();
  }

  private native int CheckConstraint_25(vtkRenderer id0,double id1[]);
  public int CheckConstraint(vtkRenderer id0,double id1[])
  {
    return CheckConstraint_25(id0,id1);
  }

  private native void ShallowCopy_26(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_26(id0);
  }

  private native void DeepCopy_27(vtkProp id0);
  public void DeepCopy(vtkProp id0)
  {
    DeepCopy_27(id0);
  }

  private native void SetRenderer_28(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_28(id0);
  }

  private native long GetMTime_29();
  public long GetMTime()
  {
    return GetMTime_29();
  }

  private native void SetPointPlacer_30(vtkPointPlacer id0);
  public void SetPointPlacer(vtkPointPlacer id0)
  {
    SetPointPlacer_30(id0);
  }

  private native long GetPointPlacer_31();
  public vtkPointPlacer GetPointPlacer()
  {
    long temp = GetPointPlacer_31();

    if (temp == 0) return null;
    return (vtkPointPlacer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetTranslationAxis_32();
  public int GetTranslationAxis()
  {
    return GetTranslationAxis_32();
  }

  private native void SetTranslationAxis_33(int id0);
  public void SetTranslationAxis(int id0)
  {
    SetTranslationAxis_33(id0);
  }

  private native int GetTranslationAxisMinValue_34();
  public int GetTranslationAxisMinValue()
  {
    return GetTranslationAxisMinValue_34();
  }

  private native int GetTranslationAxisMaxValue_35();
  public int GetTranslationAxisMaxValue()
  {
    return GetTranslationAxisMaxValue_35();
  }

  private native void SetXTranslationAxisOn_36();
  public void SetXTranslationAxisOn()
  {
    SetXTranslationAxisOn_36();
  }

  private native void SetYTranslationAxisOn_37();
  public void SetYTranslationAxisOn()
  {
    SetYTranslationAxisOn_37();
  }

  private native void SetZTranslationAxisOn_38();
  public void SetZTranslationAxisOn()
  {
    SetZTranslationAxisOn_38();
  }

  private native void SetCustomTranslationAxisOn_39();
  public void SetCustomTranslationAxisOn()
  {
    SetCustomTranslationAxisOn_39();
  }

  private native void SetTranslationAxisOff_40();
  public void SetTranslationAxisOff()
  {
    SetTranslationAxisOff_40();
  }

  private native double[] GetCustomTranslationAxis_41();
  public double[] GetCustomTranslationAxis()
  {
    return GetCustomTranslationAxis_41();
  }

  private native void SetCustomTranslationAxis_42(double id0,double id1,double id2);
  public void SetCustomTranslationAxis(double id0,double id1,double id2)
  {
    SetCustomTranslationAxis_42(id0,id1,id2);
  }

  private native void SetCustomTranslationAxis_43(double id0[]);
  public void SetCustomTranslationAxis(double id0[])
  {
    SetCustomTranslationAxis_43(id0);
  }

  private native boolean IsTranslationConstrained_44();
  public boolean IsTranslationConstrained()
  {
    return IsTranslationConstrained_44();
  }

  public vtkHandleRepresentation() { super(); }

  public vtkHandleRepresentation(long id) { super(id); }

}

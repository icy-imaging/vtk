// java wrapper for vtkAngleRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAngleRepresentation extends vtkWidgetRepresentation
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

  private native double GetAngle_4();
  public double GetAngle()
  {
    return GetAngle_4();
  }

  private native void GetPoint1WorldPosition_5(double id0[]);
  public void GetPoint1WorldPosition(double id0[])
  {
    GetPoint1WorldPosition_5(id0);
  }

  private native void GetCenterWorldPosition_6(double id0[]);
  public void GetCenterWorldPosition(double id0[])
  {
    GetCenterWorldPosition_6(id0);
  }

  private native void GetPoint2WorldPosition_7(double id0[]);
  public void GetPoint2WorldPosition(double id0[])
  {
    GetPoint2WorldPosition_7(id0);
  }

  private native void SetPoint1DisplayPosition_8(double id0[]);
  public void SetPoint1DisplayPosition(double id0[])
  {
    SetPoint1DisplayPosition_8(id0);
  }

  private native void SetCenterDisplayPosition_9(double id0[]);
  public void SetCenterDisplayPosition(double id0[])
  {
    SetCenterDisplayPosition_9(id0);
  }

  private native void SetPoint2DisplayPosition_10(double id0[]);
  public void SetPoint2DisplayPosition(double id0[])
  {
    SetPoint2DisplayPosition_10(id0);
  }

  private native void GetPoint1DisplayPosition_11(double id0[]);
  public void GetPoint1DisplayPosition(double id0[])
  {
    GetPoint1DisplayPosition_11(id0);
  }

  private native void GetCenterDisplayPosition_12(double id0[]);
  public void GetCenterDisplayPosition(double id0[])
  {
    GetCenterDisplayPosition_12(id0);
  }

  private native void GetPoint2DisplayPosition_13(double id0[]);
  public void GetPoint2DisplayPosition(double id0[])
  {
    GetPoint2DisplayPosition_13(id0);
  }

  private native void SetHandleRepresentation_14(vtkHandleRepresentation id0);
  public void SetHandleRepresentation(vtkHandleRepresentation id0)
  {
    SetHandleRepresentation_14(id0);
  }

  private native void InstantiateHandleRepresentation_15();
  public void InstantiateHandleRepresentation()
  {
    InstantiateHandleRepresentation_15();
  }

  private native long GetPoint1Representation_16();
  public vtkHandleRepresentation GetPoint1Representation()
  {
    long temp = GetPoint1Representation_16();

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetCenterRepresentation_17();
  public vtkHandleRepresentation GetCenterRepresentation()
  {
    long temp = GetCenterRepresentation_17();

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPoint2Representation_18();
  public vtkHandleRepresentation GetPoint2Representation()
  {
    long temp = GetPoint2Representation_18();

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTolerance_19(int id0);
  public void SetTolerance(int id0)
  {
    SetTolerance_19(id0);
  }

  private native int GetToleranceMinValue_20();
  public int GetToleranceMinValue()
  {
    return GetToleranceMinValue_20();
  }

  private native int GetToleranceMaxValue_21();
  public int GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_21();
  }

  private native int GetTolerance_22();
  public int GetTolerance()
  {
    return GetTolerance_22();
  }

  private native void SetLabelFormat_23(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_23(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_24();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_24(), StandardCharsets.UTF_8);
  }

  private native void SetScale_25(double id0);
  public void SetScale(double id0)
  {
    SetScale_25(id0);
  }

  private native double GetScale_26();
  public double GetScale()
  {
    return GetScale_26();
  }

  private native void SetRay1Visibility_27(int id0);
  public void SetRay1Visibility(int id0)
  {
    SetRay1Visibility_27(id0);
  }

  private native int GetRay1Visibility_28();
  public int GetRay1Visibility()
  {
    return GetRay1Visibility_28();
  }

  private native void Ray1VisibilityOn_29();
  public void Ray1VisibilityOn()
  {
    Ray1VisibilityOn_29();
  }

  private native void Ray1VisibilityOff_30();
  public void Ray1VisibilityOff()
  {
    Ray1VisibilityOff_30();
  }

  private native void SetRay2Visibility_31(int id0);
  public void SetRay2Visibility(int id0)
  {
    SetRay2Visibility_31(id0);
  }

  private native int GetRay2Visibility_32();
  public int GetRay2Visibility()
  {
    return GetRay2Visibility_32();
  }

  private native void Ray2VisibilityOn_33();
  public void Ray2VisibilityOn()
  {
    Ray2VisibilityOn_33();
  }

  private native void Ray2VisibilityOff_34();
  public void Ray2VisibilityOff()
  {
    Ray2VisibilityOff_34();
  }

  private native void SetArcVisibility_35(int id0);
  public void SetArcVisibility(int id0)
  {
    SetArcVisibility_35(id0);
  }

  private native int GetArcVisibility_36();
  public int GetArcVisibility()
  {
    return GetArcVisibility_36();
  }

  private native void ArcVisibilityOn_37();
  public void ArcVisibilityOn()
  {
    ArcVisibilityOn_37();
  }

  private native void ArcVisibilityOff_38();
  public void ArcVisibilityOff()
  {
    ArcVisibilityOff_38();
  }

  private native void BuildRepresentation_39();
  public void BuildRepresentation()
  {
    BuildRepresentation_39();
  }

  private native int ComputeInteractionState_40(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_40(id0,id1,id2);
  }

  private native void StartWidgetInteraction_41(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_41(id0);
  }

  private native void CenterWidgetInteraction_42(double id0[]);
  public void CenterWidgetInteraction(double id0[])
  {
    CenterWidgetInteraction_42(id0);
  }

  private native void WidgetInteraction_43(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_43(id0);
  }

  private native void SetRenderer_44(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_44(id0);
  }

  public vtkAngleRepresentation() { super(); }

  public vtkAngleRepresentation(long id) { super(id); }

}

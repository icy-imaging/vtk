// java wrapper for vtkCamera3DRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCamera3DRepresentation extends vtkWidgetRepresentation
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

  private native void PlaceWidget_4(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_4(id0);
  }

  private native void BuildRepresentation_5();
  public void BuildRepresentation()
  {
    BuildRepresentation_5();
  }

  private native int ComputeInteractionState_6(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_6(id0,id1,id2);
  }

  private native void StartWidgetInteraction_7(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_7(id0);
  }

  private native void WidgetInteraction_8(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_8(id0);
  }

  private native double[] GetBounds_9();
  public double[] GetBounds()
  {
    return GetBounds_9();
  }

  private native void ReleaseGraphicsResources_10(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_10(id0);
  }

  private native int RenderOpaqueGeometry_11(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_11(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_12(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_12(id0);
  }

  private native int HasTranslucentPolygonalGeometry_13();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_13();
  }

  private native void SetCamera_14(vtkCamera id0);
  public void SetCamera(vtkCamera id0)
  {
    SetCamera_14(id0);
  }

  private native long GetCamera_15();
  public vtkCamera GetCamera()
  {
    long temp = GetCamera_15();

    if (temp == 0) return null;
    return (vtkCamera)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFrontHandleDistance_16(double id0);
  public void SetFrontHandleDistance(double id0)
  {
    SetFrontHandleDistance_16(id0);
  }

  private native double GetFrontHandleDistanceMinValue_17();
  public double GetFrontHandleDistanceMinValue()
  {
    return GetFrontHandleDistanceMinValue_17();
  }

  private native double GetFrontHandleDistanceMaxValue_18();
  public double GetFrontHandleDistanceMaxValue()
  {
    return GetFrontHandleDistanceMaxValue_18();
  }

  private native double GetFrontHandleDistance_19();
  public double GetFrontHandleDistance()
  {
    return GetFrontHandleDistance_19();
  }

  private native void SetUpHandleDistance_20(double id0);
  public void SetUpHandleDistance(double id0)
  {
    SetUpHandleDistance_20(id0);
  }

  private native double GetUpHandleDistanceMinValue_21();
  public double GetUpHandleDistanceMinValue()
  {
    return GetUpHandleDistanceMinValue_21();
  }

  private native double GetUpHandleDistanceMaxValue_22();
  public double GetUpHandleDistanceMaxValue()
  {
    return GetUpHandleDistanceMaxValue_22();
  }

  private native double GetUpHandleDistance_23();
  public double GetUpHandleDistance()
  {
    return GetUpHandleDistance_23();
  }

  private native void SetTranslationAxisToXAxis_24();
  public void SetTranslationAxisToXAxis()
  {
    SetTranslationAxisToXAxis_24();
  }

  private native void SetTranslationAxisToYAxis_25();
  public void SetTranslationAxisToYAxis()
  {
    SetTranslationAxisToYAxis_25();
  }

  private native void SetTranslationAxisToZAxis_26();
  public void SetTranslationAxisToZAxis()
  {
    SetTranslationAxisToZAxis_26();
  }

  private native void SetTranslationAxisToNone_27();
  public void SetTranslationAxisToNone()
  {
    SetTranslationAxisToNone_27();
  }

  private native void SetTranslationAxis_28(int id0);
  public void SetTranslationAxis(int id0)
  {
    SetTranslationAxis_28(id0);
  }

  private native int GetTranslationAxisMinValue_29();
  public int GetTranslationAxisMinValue()
  {
    return GetTranslationAxisMinValue_29();
  }

  private native int GetTranslationAxisMaxValue_30();
  public int GetTranslationAxisMaxValue()
  {
    return GetTranslationAxisMaxValue_30();
  }

  private native int GetTranslationAxis_31();
  public int GetTranslationAxis()
  {
    return GetTranslationAxis_31();
  }

  private native void SetTranslatingAll_32(boolean id0);
  public void SetTranslatingAll(boolean id0)
  {
    SetTranslatingAll_32(id0);
  }

  private native boolean GetTranslatingAll_33();
  public boolean GetTranslatingAll()
  {
    return GetTranslatingAll_33();
  }

  private native void TranslatingAllOn_34();
  public void TranslatingAllOn()
  {
    TranslatingAllOn_34();
  }

  private native void TranslatingAllOff_35();
  public void TranslatingAllOff()
  {
    TranslatingAllOff_35();
  }

  private native void SetFrustumVisibility_36(boolean id0);
  public void SetFrustumVisibility(boolean id0)
  {
    SetFrustumVisibility_36(id0);
  }

  private native boolean GetFrustumVisibility_37();
  public boolean GetFrustumVisibility()
  {
    return GetFrustumVisibility_37();
  }

  private native void FrustumVisibilityOn_38();
  public void FrustumVisibilityOn()
  {
    FrustumVisibilityOn_38();
  }

  private native void FrustumVisibilityOff_39();
  public void FrustumVisibilityOff()
  {
    FrustumVisibilityOff_39();
  }

  private native void SetSecondaryHandlesVisibility_40(boolean id0);
  public void SetSecondaryHandlesVisibility(boolean id0)
  {
    SetSecondaryHandlesVisibility_40(id0);
  }

  private native boolean GetSecondaryHandlesVisibility_41();
  public boolean GetSecondaryHandlesVisibility()
  {
    return GetSecondaryHandlesVisibility_41();
  }

  private native void SecondaryHandlesVisibilityOn_42();
  public void SecondaryHandlesVisibilityOn()
  {
    SecondaryHandlesVisibilityOn_42();
  }

  private native void SecondaryHandlesVisibilityOff_43();
  public void SecondaryHandlesVisibilityOff()
  {
    SecondaryHandlesVisibilityOff_43();
  }

  private native void SetInteractionState_44(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_44(id0);
  }

  private native void RegisterPickers_45();
  public void RegisterPickers()
  {
    RegisterPickers_45();
  }

  private native void GetActors_46(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_46(id0);
  }

  public vtkCamera3DRepresentation() { super(); }

  public vtkCamera3DRepresentation(long id) { super(id); }
  public native long   VTKInit();

}

// java wrapper for vtkImplicitPlaneWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitPlaneWidget extends vtkPolyDataSourceWidget
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

  private native void SetEnabled_4(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_4(id0);
  }

  private native void PlaceWidget_5(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_5(id0);
  }

  private native void PlaceWidget_6();
  public void PlaceWidget()
  {
    PlaceWidget_6();
  }

  private native void PlaceWidget_7(double id0,double id1,double id2,double id3,double id4,double id5);
  public void PlaceWidget(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    PlaceWidget_7(id0,id1,id2,id3,id4,id5);
  }

  private native void SetOrigin_8(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_8(id0,id1,id2);
  }

  private native void SetOrigin_9(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_9(id0);
  }

  private native double[] GetOrigin_10();
  public double[] GetOrigin()
  {
    return GetOrigin_10();
  }

  private native void GetOrigin_11(double id0[]);
  public void GetOrigin(double id0[])
  {
    GetOrigin_11(id0);
  }

  private native void SetNormal_12(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_12(id0,id1,id2);
  }

  private native void SetNormal_13(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_13(id0);
  }

  private native double[] GetNormal_14();
  public double[] GetNormal()
  {
    return GetNormal_14();
  }

  private native void GetNormal_15(double id0[]);
  public void GetNormal(double id0[])
  {
    GetNormal_15(id0);
  }

  private native void SetNormalToXAxis_16(int id0);
  public void SetNormalToXAxis(int id0)
  {
    SetNormalToXAxis_16(id0);
  }

  private native int GetNormalToXAxis_17();
  public int GetNormalToXAxis()
  {
    return GetNormalToXAxis_17();
  }

  private native void NormalToXAxisOn_18();
  public void NormalToXAxisOn()
  {
    NormalToXAxisOn_18();
  }

  private native void NormalToXAxisOff_19();
  public void NormalToXAxisOff()
  {
    NormalToXAxisOff_19();
  }

  private native void SetNormalToYAxis_20(int id0);
  public void SetNormalToYAxis(int id0)
  {
    SetNormalToYAxis_20(id0);
  }

  private native int GetNormalToYAxis_21();
  public int GetNormalToYAxis()
  {
    return GetNormalToYAxis_21();
  }

  private native void NormalToYAxisOn_22();
  public void NormalToYAxisOn()
  {
    NormalToYAxisOn_22();
  }

  private native void NormalToYAxisOff_23();
  public void NormalToYAxisOff()
  {
    NormalToYAxisOff_23();
  }

  private native void SetNormalToZAxis_24(int id0);
  public void SetNormalToZAxis(int id0)
  {
    SetNormalToZAxis_24(id0);
  }

  private native int GetNormalToZAxis_25();
  public int GetNormalToZAxis()
  {
    return GetNormalToZAxis_25();
  }

  private native void NormalToZAxisOn_26();
  public void NormalToZAxisOn()
  {
    NormalToZAxisOn_26();
  }

  private native void NormalToZAxisOff_27();
  public void NormalToZAxisOff()
  {
    NormalToZAxisOff_27();
  }

  private native void SetTubing_28(int id0);
  public void SetTubing(int id0)
  {
    SetTubing_28(id0);
  }

  private native int GetTubing_29();
  public int GetTubing()
  {
    return GetTubing_29();
  }

  private native void TubingOn_30();
  public void TubingOn()
  {
    TubingOn_30();
  }

  private native void TubingOff_31();
  public void TubingOff()
  {
    TubingOff_31();
  }

  private native void SetDrawPlane_32(int id0);
  public void SetDrawPlane(int id0)
  {
    SetDrawPlane_32(id0);
  }

  private native int GetDrawPlane_33();
  public int GetDrawPlane()
  {
    return GetDrawPlane_33();
  }

  private native void DrawPlaneOn_34();
  public void DrawPlaneOn()
  {
    DrawPlaneOn_34();
  }

  private native void DrawPlaneOff_35();
  public void DrawPlaneOff()
  {
    DrawPlaneOff_35();
  }

  private native void SetOutlineTranslation_36(int id0);
  public void SetOutlineTranslation(int id0)
  {
    SetOutlineTranslation_36(id0);
  }

  private native int GetOutlineTranslation_37();
  public int GetOutlineTranslation()
  {
    return GetOutlineTranslation_37();
  }

  private native void OutlineTranslationOn_38();
  public void OutlineTranslationOn()
  {
    OutlineTranslationOn_38();
  }

  private native void OutlineTranslationOff_39();
  public void OutlineTranslationOff()
  {
    OutlineTranslationOff_39();
  }

  private native void SetOutsideBounds_40(int id0);
  public void SetOutsideBounds(int id0)
  {
    SetOutsideBounds_40(id0);
  }

  private native int GetOutsideBounds_41();
  public int GetOutsideBounds()
  {
    return GetOutsideBounds_41();
  }

  private native void OutsideBoundsOn_42();
  public void OutsideBoundsOn()
  {
    OutsideBoundsOn_42();
  }

  private native void OutsideBoundsOff_43();
  public void OutsideBoundsOff()
  {
    OutsideBoundsOff_43();
  }

  private native void SetScaleEnabled_44(int id0);
  public void SetScaleEnabled(int id0)
  {
    SetScaleEnabled_44(id0);
  }

  private native int GetScaleEnabled_45();
  public int GetScaleEnabled()
  {
    return GetScaleEnabled_45();
  }

  private native void ScaleEnabledOn_46();
  public void ScaleEnabledOn()
  {
    ScaleEnabledOn_46();
  }

  private native void ScaleEnabledOff_47();
  public void ScaleEnabledOff()
  {
    ScaleEnabledOff_47();
  }

  private native void SetOriginTranslation_48(int id0);
  public void SetOriginTranslation(int id0)
  {
    SetOriginTranslation_48(id0);
  }

  private native int GetOriginTranslation_49();
  public int GetOriginTranslation()
  {
    return GetOriginTranslation_49();
  }

  private native void OriginTranslationOn_50();
  public void OriginTranslationOn()
  {
    OriginTranslationOn_50();
  }

  private native void OriginTranslationOff_51();
  public void OriginTranslationOff()
  {
    OriginTranslationOff_51();
  }

  private native void SetDiagonalRatio_52(double id0);
  public void SetDiagonalRatio(double id0)
  {
    SetDiagonalRatio_52(id0);
  }

  private native double GetDiagonalRatioMinValue_53();
  public double GetDiagonalRatioMinValue()
  {
    return GetDiagonalRatioMinValue_53();
  }

  private native double GetDiagonalRatioMaxValue_54();
  public double GetDiagonalRatioMaxValue()
  {
    return GetDiagonalRatioMaxValue_54();
  }

  private native double GetDiagonalRatio_55();
  public double GetDiagonalRatio()
  {
    return GetDiagonalRatio_55();
  }

  private native void GetPolyData_56(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_56(id0);
  }

  private native long GetPolyDataAlgorithm_57();
  public vtkPolyDataAlgorithm GetPolyDataAlgorithm()
  {
    long temp = GetPolyDataAlgorithm_57();

    if (temp == 0) return null;
    return (vtkPolyDataAlgorithm)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetPlane_58(vtkPlane id0);
  public void GetPlane(vtkPlane id0)
  {
    GetPlane_58(id0);
  }

  private native void UpdatePlacement_59();
  public void UpdatePlacement()
  {
    UpdatePlacement_59();
  }

  private native void SizeHandles_60();
  public void SizeHandles()
  {
    SizeHandles_60();
  }

  private native long GetNormalProperty_61();
  public vtkProperty GetNormalProperty()
  {
    long temp = GetNormalProperty_61();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedNormalProperty_62();
  public vtkProperty GetSelectedNormalProperty()
  {
    long temp = GetSelectedNormalProperty_62();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetPlaneProperty_63();
  public vtkProperty GetPlaneProperty()
  {
    long temp = GetPlaneProperty_63();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedPlaneProperty_64();
  public vtkProperty GetSelectedPlaneProperty()
  {
    long temp = GetSelectedPlaneProperty_64();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutlineProperty_65();
  public vtkProperty GetOutlineProperty()
  {
    long temp = GetOutlineProperty_65();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedOutlineProperty_66();
  public vtkProperty GetSelectedOutlineProperty()
  {
    long temp = GetSelectedOutlineProperty_66();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetEdgesProperty_67();
  public vtkProperty GetEdgesProperty()
  {
    long temp = GetEdgesProperty_67();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkImplicitPlaneWidget() { super(); }

  public vtkImplicitPlaneWidget(long id) { super(id); }
  public native long   VTKInit();

}

// java wrapper for vtkViewport object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkViewport extends vtkObject
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

  private native void AddViewProp_4(vtkProp id0);
  public void AddViewProp(vtkProp id0)
  {
    AddViewProp_4(id0);
  }

  private native long GetViewProps_5();
  public vtkPropCollection GetViewProps()
  {
    long temp = GetViewProps_5();

    if (temp == 0) return null;
    return (vtkPropCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int HasViewProp_6(vtkProp id0);
  public int HasViewProp(vtkProp id0)
  {
    return HasViewProp_6(id0);
  }

  private native void RemoveViewProp_7(vtkProp id0);
  public void RemoveViewProp(vtkProp id0)
  {
    RemoveViewProp_7(id0);
  }

  private native void RemoveAllViewProps_8();
  public void RemoveAllViewProps()
  {
    RemoveAllViewProps_8();
  }

  private native void AddActor2D_9(vtkProp id0);
  public void AddActor2D(vtkProp id0)
  {
    AddActor2D_9(id0);
  }

  private native void RemoveActor2D_10(vtkProp id0);
  public void RemoveActor2D(vtkProp id0)
  {
    RemoveActor2D_10(id0);
  }

  private native long GetActors2D_11();
  public vtkActor2DCollection GetActors2D()
  {
    long temp = GetActors2D_11();

    if (temp == 0) return null;
    return (vtkActor2DCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBackground_12(double id0,double id1,double id2);
  public void SetBackground(double id0,double id1,double id2)
  {
    SetBackground_12(id0,id1,id2);
  }

  private native void SetBackground_13(double id0[]);
  public void SetBackground(double id0[])
  {
    SetBackground_13(id0);
  }

  private native double[] GetBackground_14();
  public double[] GetBackground()
  {
    return GetBackground_14();
  }

  private native void SetBackground2_15(double id0,double id1,double id2);
  public void SetBackground2(double id0,double id1,double id2)
  {
    SetBackground2_15(id0,id1,id2);
  }

  private native void SetBackground2_16(double id0[]);
  public void SetBackground2(double id0[])
  {
    SetBackground2_16(id0);
  }

  private native double[] GetBackground2_17();
  public double[] GetBackground2()
  {
    return GetBackground2_17();
  }

  private native void SetBackgroundAlpha_18(double id0);
  public void SetBackgroundAlpha(double id0)
  {
    SetBackgroundAlpha_18(id0);
  }

  private native double GetBackgroundAlphaMinValue_19();
  public double GetBackgroundAlphaMinValue()
  {
    return GetBackgroundAlphaMinValue_19();
  }

  private native double GetBackgroundAlphaMaxValue_20();
  public double GetBackgroundAlphaMaxValue()
  {
    return GetBackgroundAlphaMaxValue_20();
  }

  private native double GetBackgroundAlpha_21();
  public double GetBackgroundAlpha()
  {
    return GetBackgroundAlpha_21();
  }

  private native void SetGradientBackground_22(boolean id0);
  public void SetGradientBackground(boolean id0)
  {
    SetGradientBackground_22(id0);
  }

  private native boolean GetGradientBackground_23();
  public boolean GetGradientBackground()
  {
    return GetGradientBackground_23();
  }

  private native void GradientBackgroundOn_24();
  public void GradientBackgroundOn()
  {
    GradientBackgroundOn_24();
  }

  private native void GradientBackgroundOff_25();
  public void GradientBackgroundOff()
  {
    GradientBackgroundOff_25();
  }

  private native void SetDitherGradient_26(boolean id0);
  public void SetDitherGradient(boolean id0)
  {
    SetDitherGradient_26(id0);
  }

  private native boolean GetDitherGradient_27();
  public boolean GetDitherGradient()
  {
    return GetDitherGradient_27();
  }

  private native void DitherGradientOn_28();
  public void DitherGradientOn()
  {
    DitherGradientOn_28();
  }

  private native void DitherGradientOff_29();
  public void DitherGradientOff()
  {
    DitherGradientOff_29();
  }

  private native void SetGradientMode_30(int id0);
  public void SetGradientMode(int id0)
  {
    SetGradientMode_30(id0);
  }

  private native int GetGradientMode_31();
  public int GetGradientMode()
  {
    return GetGradientMode_31();
  }

  private native void SetAspect_32(double id0,double id1);
  public void SetAspect(double id0,double id1)
  {
    SetAspect_32(id0,id1);
  }

  private native void SetAspect_33(double id0[]);
  public void SetAspect(double id0[])
  {
    SetAspect_33(id0);
  }

  private native double[] GetAspect_34();
  public double[] GetAspect()
  {
    return GetAspect_34();
  }

  private native void ComputeAspect_35();
  public void ComputeAspect()
  {
    ComputeAspect_35();
  }

  private native void SetPixelAspect_36(double id0,double id1);
  public void SetPixelAspect(double id0,double id1)
  {
    SetPixelAspect_36(id0,id1);
  }

  private native void SetPixelAspect_37(double id0[]);
  public void SetPixelAspect(double id0[])
  {
    SetPixelAspect_37(id0);
  }

  private native double[] GetPixelAspect_38();
  public double[] GetPixelAspect()
  {
    return GetPixelAspect_38();
  }

  private native void SetViewport_39(double id0,double id1,double id2,double id3);
  public void SetViewport(double id0,double id1,double id2,double id3)
  {
    SetViewport_39(id0,id1,id2,id3);
  }

  private native void SetViewport_40(double id0[]);
  public void SetViewport(double id0[])
  {
    SetViewport_40(id0);
  }

  private native double[] GetViewport_41();
  public double[] GetViewport()
  {
    return GetViewport_41();
  }

  private native void SetDisplayPoint_42(double id0,double id1,double id2);
  public void SetDisplayPoint(double id0,double id1,double id2)
  {
    SetDisplayPoint_42(id0,id1,id2);
  }

  private native void SetDisplayPoint_43(double id0[]);
  public void SetDisplayPoint(double id0[])
  {
    SetDisplayPoint_43(id0);
  }

  private native double[] GetDisplayPoint_44();
  public double[] GetDisplayPoint()
  {
    return GetDisplayPoint_44();
  }

  private native void SetViewPoint_45(double id0,double id1,double id2);
  public void SetViewPoint(double id0,double id1,double id2)
  {
    SetViewPoint_45(id0,id1,id2);
  }

  private native void SetViewPoint_46(double id0[]);
  public void SetViewPoint(double id0[])
  {
    SetViewPoint_46(id0);
  }

  private native double[] GetViewPoint_47();
  public double[] GetViewPoint()
  {
    return GetViewPoint_47();
  }

  private native void SetWorldPoint_48(double id0,double id1,double id2,double id3);
  public void SetWorldPoint(double id0,double id1,double id2,double id3)
  {
    SetWorldPoint_48(id0,id1,id2,id3);
  }

  private native void SetWorldPoint_49(double id0[]);
  public void SetWorldPoint(double id0[])
  {
    SetWorldPoint_49(id0);
  }

  private native double[] GetWorldPoint_50();
  public double[] GetWorldPoint()
  {
    return GetWorldPoint_50();
  }

  private native double[] GetCenter_51();
  public double[] GetCenter()
  {
    return GetCenter_51();
  }

  private native int IsInViewport_52(int id0,int id1);
  public int IsInViewport(int id0,int id1)
  {
    return IsInViewport_52(id0,id1);
  }

  private native long GetVTKWindow_53();
  public vtkWindow GetVTKWindow()
  {
    long temp = GetVTKWindow_53();

    if (temp == 0) return null;
    return (vtkWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void DisplayToView_54();
  public void DisplayToView()
  {
    DisplayToView_54();
  }

  private native void ViewToDisplay_55();
  public void ViewToDisplay()
  {
    ViewToDisplay_55();
  }

  private native void WorldToView_56();
  public void WorldToView()
  {
    WorldToView_56();
  }

  private native void ViewToWorld_57();
  public void ViewToWorld()
  {
    ViewToWorld_57();
  }

  private native void DisplayToWorld_58();
  public void DisplayToWorld()
  {
    DisplayToWorld_58();
  }

  private native void WorldToDisplay_59();
  public void WorldToDisplay()
  {
    WorldToDisplay_59();
  }

  private native int[] GetSize_60();
  public int[] GetSize()
  {
    return GetSize_60();
  }

  private native int[] GetOrigin_61();
  public int[] GetOrigin()
  {
    return GetOrigin_61();
  }

  private native long PickProp_62(double id0,double id1);
  public vtkAssemblyPath PickProp(double id0,double id1)
  {
    long temp = PickProp_62(id0,id1);

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PickProp_63(double id0,double id1,double id2,double id3);
  public vtkAssemblyPath PickProp(double id0,double id1,double id2,double id3)
  {
    long temp = PickProp_63(id0,id1,id2,id3);

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PickPropFrom_64(double id0,double id1,vtkPropCollection id2);
  public vtkAssemblyPath PickPropFrom(double id0,double id1,vtkPropCollection id2)
  {
    long temp = PickPropFrom_64(id0,id1,id2);

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long PickPropFrom_65(double id0,double id1,double id2,double id3,vtkPropCollection id4);
  public vtkAssemblyPath PickPropFrom(double id0,double id1,double id2,double id3,vtkPropCollection id4)
  {
    long temp = PickPropFrom_65(id0,id1,id2,id3,id4);

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double GetPickX_66();
  public double GetPickX()
  {
    return GetPickX_66();
  }

  private native double GetPickY_67();
  public double GetPickY()
  {
    return GetPickY_67();
  }

  private native double GetPickWidth_68();
  public double GetPickWidth()
  {
    return GetPickWidth_68();
  }

  private native double GetPickHeight_69();
  public double GetPickHeight()
  {
    return GetPickHeight_69();
  }

  private native double GetPickX1_70();
  public double GetPickX1()
  {
    return GetPickX1_70();
  }

  private native double GetPickY1_71();
  public double GetPickY1()
  {
    return GetPickY1_71();
  }

  private native double GetPickX2_72();
  public double GetPickX2()
  {
    return GetPickX2_72();
  }

  private native double GetPickY2_73();
  public double GetPickY2()
  {
    return GetPickY2_73();
  }

  private native long GetPickResultProps_74();
  public vtkPropCollection GetPickResultProps()
  {
    long temp = GetPickResultProps_74();

    if (temp == 0) return null;
    return (vtkPropCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double GetPickedZ_75();
  public double GetPickedZ()
  {
    return GetPickedZ_75();
  }

  private native void SetEnvironmentalBG_76(double id0,double id1,double id2);
  public void SetEnvironmentalBG(double id0,double id1,double id2)
  {
    SetEnvironmentalBG_76(id0,id1,id2);
  }

  private native void SetEnvironmentalBG_77(double id0[]);
  public void SetEnvironmentalBG(double id0[])
  {
    SetEnvironmentalBG_77(id0);
  }

  private native double[] GetEnvironmentalBG_78();
  public double[] GetEnvironmentalBG()
  {
    return GetEnvironmentalBG_78();
  }

  private native void SetEnvironmentalBG2_79(double id0,double id1,double id2);
  public void SetEnvironmentalBG2(double id0,double id1,double id2)
  {
    SetEnvironmentalBG2_79(id0,id1,id2);
  }

  private native void SetEnvironmentalBG2_80(double id0[]);
  public void SetEnvironmentalBG2(double id0[])
  {
    SetEnvironmentalBG2_80(id0);
  }

  private native double[] GetEnvironmentalBG2_81();
  public double[] GetEnvironmentalBG2()
  {
    return GetEnvironmentalBG2_81();
  }

  private native void SetGradientEnvironmentalBG_82(boolean id0);
  public void SetGradientEnvironmentalBG(boolean id0)
  {
    SetGradientEnvironmentalBG_82(id0);
  }

  private native boolean GetGradientEnvironmentalBG_83();
  public boolean GetGradientEnvironmentalBG()
  {
    return GetGradientEnvironmentalBG_83();
  }

  private native void GradientEnvironmentalBGOn_84();
  public void GradientEnvironmentalBGOn()
  {
    GradientEnvironmentalBGOn_84();
  }

  private native void GradientEnvironmentalBGOff_85();
  public void GradientEnvironmentalBGOff()
  {
    GradientEnvironmentalBGOff_85();
  }

  public vtkViewport() { super(); }

  public vtkViewport(long id) { super(id); }

}

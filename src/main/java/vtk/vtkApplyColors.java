// java wrapper for vtkApplyColors object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkApplyColors extends vtkPassInputTypeAlgorithm
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

  private native void SetPointLookupTable_4(vtkScalarsToColors id0);
  public void SetPointLookupTable(vtkScalarsToColors id0)
  {
    SetPointLookupTable_4(id0);
  }

  private native long GetPointLookupTable_5();
  public vtkScalarsToColors GetPointLookupTable()
  {
    long temp = GetPointLookupTable_5();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUsePointLookupTable_6(boolean id0);
  public void SetUsePointLookupTable(boolean id0)
  {
    SetUsePointLookupTable_6(id0);
  }

  private native boolean GetUsePointLookupTable_7();
  public boolean GetUsePointLookupTable()
  {
    return GetUsePointLookupTable_7();
  }

  private native void UsePointLookupTableOn_8();
  public void UsePointLookupTableOn()
  {
    UsePointLookupTableOn_8();
  }

  private native void UsePointLookupTableOff_9();
  public void UsePointLookupTableOff()
  {
    UsePointLookupTableOff_9();
  }

  private native void SetScalePointLookupTable_10(boolean id0);
  public void SetScalePointLookupTable(boolean id0)
  {
    SetScalePointLookupTable_10(id0);
  }

  private native boolean GetScalePointLookupTable_11();
  public boolean GetScalePointLookupTable()
  {
    return GetScalePointLookupTable_11();
  }

  private native void ScalePointLookupTableOn_12();
  public void ScalePointLookupTableOn()
  {
    ScalePointLookupTableOn_12();
  }

  private native void ScalePointLookupTableOff_13();
  public void ScalePointLookupTableOff()
  {
    ScalePointLookupTableOff_13();
  }

  private native void SetDefaultPointColor_14(double id0,double id1,double id2);
  public void SetDefaultPointColor(double id0,double id1,double id2)
  {
    SetDefaultPointColor_14(id0,id1,id2);
  }

  private native void SetDefaultPointColor_15(double id0[]);
  public void SetDefaultPointColor(double id0[])
  {
    SetDefaultPointColor_15(id0);
  }

  private native double[] GetDefaultPointColor_16();
  public double[] GetDefaultPointColor()
  {
    return GetDefaultPointColor_16();
  }

  private native void SetDefaultPointOpacity_17(double id0);
  public void SetDefaultPointOpacity(double id0)
  {
    SetDefaultPointOpacity_17(id0);
  }

  private native double GetDefaultPointOpacity_18();
  public double GetDefaultPointOpacity()
  {
    return GetDefaultPointOpacity_18();
  }

  private native void SetSelectedPointColor_19(double id0,double id1,double id2);
  public void SetSelectedPointColor(double id0,double id1,double id2)
  {
    SetSelectedPointColor_19(id0,id1,id2);
  }

  private native void SetSelectedPointColor_20(double id0[]);
  public void SetSelectedPointColor(double id0[])
  {
    SetSelectedPointColor_20(id0);
  }

  private native double[] GetSelectedPointColor_21();
  public double[] GetSelectedPointColor()
  {
    return GetSelectedPointColor_21();
  }

  private native void SetSelectedPointOpacity_22(double id0);
  public void SetSelectedPointOpacity(double id0)
  {
    SetSelectedPointOpacity_22(id0);
  }

  private native double GetSelectedPointOpacity_23();
  public double GetSelectedPointOpacity()
  {
    return GetSelectedPointOpacity_23();
  }

  private native void SetPointColorOutputArrayName_24(byte[] id0, int len0);
  public void SetPointColorOutputArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPointColorOutputArrayName_24(bytes0, bytes0.length);
  }

  private native byte[] GetPointColorOutputArrayName_25();
  public String GetPointColorOutputArrayName()
  {
    return new String(GetPointColorOutputArrayName_25(), StandardCharsets.UTF_8);
  }

  private native void SetCellLookupTable_26(vtkScalarsToColors id0);
  public void SetCellLookupTable(vtkScalarsToColors id0)
  {
    SetCellLookupTable_26(id0);
  }

  private native long GetCellLookupTable_27();
  public vtkScalarsToColors GetCellLookupTable()
  {
    long temp = GetCellLookupTable_27();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseCellLookupTable_28(boolean id0);
  public void SetUseCellLookupTable(boolean id0)
  {
    SetUseCellLookupTable_28(id0);
  }

  private native boolean GetUseCellLookupTable_29();
  public boolean GetUseCellLookupTable()
  {
    return GetUseCellLookupTable_29();
  }

  private native void UseCellLookupTableOn_30();
  public void UseCellLookupTableOn()
  {
    UseCellLookupTableOn_30();
  }

  private native void UseCellLookupTableOff_31();
  public void UseCellLookupTableOff()
  {
    UseCellLookupTableOff_31();
  }

  private native void SetScaleCellLookupTable_32(boolean id0);
  public void SetScaleCellLookupTable(boolean id0)
  {
    SetScaleCellLookupTable_32(id0);
  }

  private native boolean GetScaleCellLookupTable_33();
  public boolean GetScaleCellLookupTable()
  {
    return GetScaleCellLookupTable_33();
  }

  private native void ScaleCellLookupTableOn_34();
  public void ScaleCellLookupTableOn()
  {
    ScaleCellLookupTableOn_34();
  }

  private native void ScaleCellLookupTableOff_35();
  public void ScaleCellLookupTableOff()
  {
    ScaleCellLookupTableOff_35();
  }

  private native void SetDefaultCellColor_36(double id0,double id1,double id2);
  public void SetDefaultCellColor(double id0,double id1,double id2)
  {
    SetDefaultCellColor_36(id0,id1,id2);
  }

  private native void SetDefaultCellColor_37(double id0[]);
  public void SetDefaultCellColor(double id0[])
  {
    SetDefaultCellColor_37(id0);
  }

  private native double[] GetDefaultCellColor_38();
  public double[] GetDefaultCellColor()
  {
    return GetDefaultCellColor_38();
  }

  private native void SetDefaultCellOpacity_39(double id0);
  public void SetDefaultCellOpacity(double id0)
  {
    SetDefaultCellOpacity_39(id0);
  }

  private native double GetDefaultCellOpacity_40();
  public double GetDefaultCellOpacity()
  {
    return GetDefaultCellOpacity_40();
  }

  private native void SetSelectedCellColor_41(double id0,double id1,double id2);
  public void SetSelectedCellColor(double id0,double id1,double id2)
  {
    SetSelectedCellColor_41(id0,id1,id2);
  }

  private native void SetSelectedCellColor_42(double id0[]);
  public void SetSelectedCellColor(double id0[])
  {
    SetSelectedCellColor_42(id0);
  }

  private native double[] GetSelectedCellColor_43();
  public double[] GetSelectedCellColor()
  {
    return GetSelectedCellColor_43();
  }

  private native void SetSelectedCellOpacity_44(double id0);
  public void SetSelectedCellOpacity(double id0)
  {
    SetSelectedCellOpacity_44(id0);
  }

  private native double GetSelectedCellOpacity_45();
  public double GetSelectedCellOpacity()
  {
    return GetSelectedCellOpacity_45();
  }

  private native void SetCellColorOutputArrayName_46(byte[] id0, int len0);
  public void SetCellColorOutputArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCellColorOutputArrayName_46(bytes0, bytes0.length);
  }

  private native byte[] GetCellColorOutputArrayName_47();
  public String GetCellColorOutputArrayName()
  {
    return new String(GetCellColorOutputArrayName_47(), StandardCharsets.UTF_8);
  }

  private native void SetUseCurrentAnnotationColor_48(boolean id0);
  public void SetUseCurrentAnnotationColor(boolean id0)
  {
    SetUseCurrentAnnotationColor_48(id0);
  }

  private native boolean GetUseCurrentAnnotationColor_49();
  public boolean GetUseCurrentAnnotationColor()
  {
    return GetUseCurrentAnnotationColor_49();
  }

  private native void UseCurrentAnnotationColorOn_50();
  public void UseCurrentAnnotationColorOn()
  {
    UseCurrentAnnotationColorOn_50();
  }

  private native void UseCurrentAnnotationColorOff_51();
  public void UseCurrentAnnotationColorOff()
  {
    UseCurrentAnnotationColorOff_51();
  }

  private native long GetMTime_52();
  public long GetMTime()
  {
    return GetMTime_52();
  }

  public vtkApplyColors() { super(); }

  public vtkApplyColors(long id) { super(id); }
  public native long   VTKInit();

}

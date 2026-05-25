// java wrapper for vtkImageProperty object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageProperty extends vtkObject
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

  private native void DeepCopy_4(vtkImageProperty id0);
  public void DeepCopy(vtkImageProperty id0)
  {
    DeepCopy_4(id0);
  }

  private native void SetColorWindow_5(double id0);
  public void SetColorWindow(double id0)
  {
    SetColorWindow_5(id0);
  }

  private native double GetColorWindow_6();
  public double GetColorWindow()
  {
    return GetColorWindow_6();
  }

  private native void SetColorLevel_7(double id0);
  public void SetColorLevel(double id0)
  {
    SetColorLevel_7(id0);
  }

  private native double GetColorLevel_8();
  public double GetColorLevel()
  {
    return GetColorLevel_8();
  }

  private native void SetLookupTable_9(vtkScalarsToColors id0);
  public void SetLookupTable(vtkScalarsToColors id0)
  {
    SetLookupTable_9(id0);
  }

  private native long GetLookupTable_10();
  public vtkScalarsToColors GetLookupTable()
  {
    long temp = GetLookupTable_10();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetUseLookupTableScalarRange_11(int id0);
  public void SetUseLookupTableScalarRange(int id0)
  {
    SetUseLookupTableScalarRange_11(id0);
  }

  private native int GetUseLookupTableScalarRange_12();
  public int GetUseLookupTableScalarRange()
  {
    return GetUseLookupTableScalarRange_12();
  }

  private native void UseLookupTableScalarRangeOn_13();
  public void UseLookupTableScalarRangeOn()
  {
    UseLookupTableScalarRangeOn_13();
  }

  private native void UseLookupTableScalarRangeOff_14();
  public void UseLookupTableScalarRangeOff()
  {
    UseLookupTableScalarRangeOff_14();
  }

  private native void SetOpacity_15(double id0);
  public void SetOpacity(double id0)
  {
    SetOpacity_15(id0);
  }

  private native double GetOpacityMinValue_16();
  public double GetOpacityMinValue()
  {
    return GetOpacityMinValue_16();
  }

  private native double GetOpacityMaxValue_17();
  public double GetOpacityMaxValue()
  {
    return GetOpacityMaxValue_17();
  }

  private native double GetOpacity_18();
  public double GetOpacity()
  {
    return GetOpacity_18();
  }

  private native void SetAmbient_19(double id0);
  public void SetAmbient(double id0)
  {
    SetAmbient_19(id0);
  }

  private native double GetAmbientMinValue_20();
  public double GetAmbientMinValue()
  {
    return GetAmbientMinValue_20();
  }

  private native double GetAmbientMaxValue_21();
  public double GetAmbientMaxValue()
  {
    return GetAmbientMaxValue_21();
  }

  private native double GetAmbient_22();
  public double GetAmbient()
  {
    return GetAmbient_22();
  }

  private native void SetDiffuse_23(double id0);
  public void SetDiffuse(double id0)
  {
    SetDiffuse_23(id0);
  }

  private native double GetDiffuseMinValue_24();
  public double GetDiffuseMinValue()
  {
    return GetDiffuseMinValue_24();
  }

  private native double GetDiffuseMaxValue_25();
  public double GetDiffuseMaxValue()
  {
    return GetDiffuseMaxValue_25();
  }

  private native double GetDiffuse_26();
  public double GetDiffuse()
  {
    return GetDiffuse_26();
  }

  private native void SetInterpolationType_27(int id0);
  public void SetInterpolationType(int id0)
  {
    SetInterpolationType_27(id0);
  }

  private native int GetInterpolationTypeMinValue_28();
  public int GetInterpolationTypeMinValue()
  {
    return GetInterpolationTypeMinValue_28();
  }

  private native int GetInterpolationTypeMaxValue_29();
  public int GetInterpolationTypeMaxValue()
  {
    return GetInterpolationTypeMaxValue_29();
  }

  private native int GetInterpolationType_30();
  public int GetInterpolationType()
  {
    return GetInterpolationType_30();
  }

  private native void SetInterpolationTypeToNearest_31();
  public void SetInterpolationTypeToNearest()
  {
    SetInterpolationTypeToNearest_31();
  }

  private native void SetInterpolationTypeToLinear_32();
  public void SetInterpolationTypeToLinear()
  {
    SetInterpolationTypeToLinear_32();
  }

  private native void SetInterpolationTypeToCubic_33();
  public void SetInterpolationTypeToCubic()
  {
    SetInterpolationTypeToCubic_33();
  }

  private native byte[] GetInterpolationTypeAsString_34();
  public String GetInterpolationTypeAsString()
  {
    return new String(GetInterpolationTypeAsString_34(), StandardCharsets.UTF_8);
  }

  private native void SetLayerNumber_35(int id0);
  public void SetLayerNumber(int id0)
  {
    SetLayerNumber_35(id0);
  }

  private native int GetLayerNumber_36();
  public int GetLayerNumber()
  {
    return GetLayerNumber_36();
  }

  private native void SetCheckerboard_37(int id0);
  public void SetCheckerboard(int id0)
  {
    SetCheckerboard_37(id0);
  }

  private native void CheckerboardOn_38();
  public void CheckerboardOn()
  {
    CheckerboardOn_38();
  }

  private native void CheckerboardOff_39();
  public void CheckerboardOff()
  {
    CheckerboardOff_39();
  }

  private native int GetCheckerboard_40();
  public int GetCheckerboard()
  {
    return GetCheckerboard_40();
  }

  private native void SetCheckerboardSpacing_41(double id0,double id1);
  public void SetCheckerboardSpacing(double id0,double id1)
  {
    SetCheckerboardSpacing_41(id0,id1);
  }

  private native void SetCheckerboardSpacing_42(double id0[]);
  public void SetCheckerboardSpacing(double id0[])
  {
    SetCheckerboardSpacing_42(id0);
  }

  private native double[] GetCheckerboardSpacing_43();
  public double[] GetCheckerboardSpacing()
  {
    return GetCheckerboardSpacing_43();
  }

  private native void SetCheckerboardOffset_44(double id0,double id1);
  public void SetCheckerboardOffset(double id0,double id1)
  {
    SetCheckerboardOffset_44(id0,id1);
  }

  private native void SetCheckerboardOffset_45(double id0[]);
  public void SetCheckerboardOffset(double id0[])
  {
    SetCheckerboardOffset_45(id0);
  }

  private native double[] GetCheckerboardOffset_46();
  public double[] GetCheckerboardOffset()
  {
    return GetCheckerboardOffset_46();
  }

  private native void SetBacking_47(int id0);
  public void SetBacking(int id0)
  {
    SetBacking_47(id0);
  }

  private native void BackingOn_48();
  public void BackingOn()
  {
    BackingOn_48();
  }

  private native void BackingOff_49();
  public void BackingOff()
  {
    BackingOff_49();
  }

  private native int GetBacking_50();
  public int GetBacking()
  {
    return GetBacking_50();
  }

  private native void SetBackingColor_51(double id0,double id1,double id2);
  public void SetBackingColor(double id0,double id1,double id2)
  {
    SetBackingColor_51(id0,id1,id2);
  }

  private native void SetBackingColor_52(double id0[]);
  public void SetBackingColor(double id0[])
  {
    SetBackingColor_52(id0);
  }

  private native double[] GetBackingColor_53();
  public double[] GetBackingColor()
  {
    return GetBackingColor_53();
  }

  private native long GetMTime_54();
  public long GetMTime()
  {
    return GetMTime_54();
  }

  public vtkImageProperty() { super(); }

  public vtkImageProperty(long id) { super(id); }
  public native long   VTKInit();

}

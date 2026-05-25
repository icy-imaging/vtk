// java wrapper for vtkScalarsToColors object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkScalarsToColors extends vtkObject
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

  private native int IsOpaque_4();
  public int IsOpaque()
  {
    return IsOpaque_4();
  }

  private native int IsOpaque_5(vtkAbstractArray id0,int id1,int id2);
  public int IsOpaque(vtkAbstractArray id0,int id1,int id2)
  {
    return IsOpaque_5(id0,id1,id2);
  }

  private native int IsOpaque_6(vtkAbstractArray id0,int id1,int id2,vtkUnsignedCharArray id3,byte id4);
  public int IsOpaque(vtkAbstractArray id0,int id1,int id2,vtkUnsignedCharArray id3,byte id4)
  {
    return IsOpaque_6(id0,id1,id2,id3,id4);
  }

  private native void Build_7();
  public void Build()
  {
    Build_7();
  }

  private native double[] GetRange_8();
  public double[] GetRange()
  {
    return GetRange_8();
  }

  private native void SetRange_9(double id0,double id1);
  public void SetRange(double id0,double id1)
  {
    SetRange_9(id0,id1);
  }

  private native void SetRange_10(double id0[]);
  public void SetRange(double id0[])
  {
    SetRange_10(id0);
  }

  private native void GetColor_11(double id0,double id1[]);
  public void GetColor(double id0,double id1[])
  {
    GetColor_11(id0,id1);
  }

  private native double[] GetColor_12(double id0);
  public double[] GetColor(double id0)
  {
    return GetColor_12(id0);
  }

  private native double GetOpacity_13(double id0);
  public double GetOpacity(double id0)
  {
    return GetOpacity_13(id0);
  }

  private native double GetLuminance_14(double id0);
  public double GetLuminance(double id0)
  {
    return GetLuminance_14(id0);
  }

  private native void SetAlpha_15(double id0);
  public void SetAlpha(double id0)
  {
    SetAlpha_15(id0);
  }

  private native double GetAlpha_16();
  public double GetAlpha()
  {
    return GetAlpha_16();
  }

  private native long MapScalars_17(vtkDataArray id0,int id1,int id2,int id3);
  public vtkUnsignedCharArray MapScalars(vtkDataArray id0,int id1,int id2,int id3)
  {
    long temp = MapScalars_17(id0,id1,id2,id3);

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long MapScalars_18(vtkAbstractArray id0,int id1,int id2,int id3);
  public vtkUnsignedCharArray MapScalars(vtkAbstractArray id0,int id1,int id2,int id3)
  {
    long temp = MapScalars_18(id0,id1,id2,id3);

    if (temp == 0) return null;
    return (vtkUnsignedCharArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetVectorMode_19(int id0);
  public void SetVectorMode(int id0)
  {
    SetVectorMode_19(id0);
  }

  private native int GetVectorMode_20();
  public int GetVectorMode()
  {
    return GetVectorMode_20();
  }

  private native void SetVectorModeToMagnitude_21();
  public void SetVectorModeToMagnitude()
  {
    SetVectorModeToMagnitude_21();
  }

  private native void SetVectorModeToComponent_22();
  public void SetVectorModeToComponent()
  {
    SetVectorModeToComponent_22();
  }

  private native void SetVectorModeToRGBColors_23();
  public void SetVectorModeToRGBColors()
  {
    SetVectorModeToRGBColors_23();
  }

  private native void SetVectorComponent_24(int id0);
  public void SetVectorComponent(int id0)
  {
    SetVectorComponent_24(id0);
  }

  private native int GetVectorComponent_25();
  public int GetVectorComponent()
  {
    return GetVectorComponent_25();
  }

  private native void SetVectorSize_26(int id0);
  public void SetVectorSize(int id0)
  {
    SetVectorSize_26(id0);
  }

  private native int GetVectorSize_27();
  public int GetVectorSize()
  {
    return GetVectorSize_27();
  }

  private native void DeepCopy_28(vtkScalarsToColors id0);
  public void DeepCopy(vtkScalarsToColors id0)
  {
    DeepCopy_28(id0);
  }

  private native int UsingLogScale_29();
  public int UsingLogScale()
  {
    return UsingLogScale_29();
  }

  private native long GetNumberOfAvailableColors_30();
  public long GetNumberOfAvailableColors()
  {
    return GetNumberOfAvailableColors_30();
  }

  private native void SetAnnotations_31(vtkAbstractArray id0,vtkStringArray id1);
  public void SetAnnotations(vtkAbstractArray id0,vtkStringArray id1)
  {
    SetAnnotations_31(id0,id1);
  }

  private native long GetAnnotatedValues_32();
  public vtkAbstractArray GetAnnotatedValues()
  {
    long temp = GetAnnotatedValues_32();

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAnnotations_33();
  public vtkStringArray GetAnnotations()
  {
    long temp = GetAnnotations_33();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long SetAnnotation_34(byte[] id0, int len0,byte[] id1, int len1);
  public long SetAnnotation(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return SetAnnotation_34(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native long GetNumberOfAnnotatedValues_35();
  public long GetNumberOfAnnotatedValues()
  {
    return GetNumberOfAnnotatedValues_35();
  }

  private native byte[] GetAnnotation_36(long id0);
  public String GetAnnotation(long id0)
  {
    return new String(GetAnnotation_36(id0), StandardCharsets.UTF_8);
  }

  private native void GetIndexedColor_37(long id0,double id1[]);
  public void GetIndexedColor(long id0,double id1[])
  {
    GetIndexedColor_37(id0,id1);
  }

  private native void ResetAnnotations_38();
  public void ResetAnnotations()
  {
    ResetAnnotations_38();
  }

  private native void SetIndexedLookup_39(int id0);
  public void SetIndexedLookup(int id0)
  {
    SetIndexedLookup_39(id0);
  }

  private native int GetIndexedLookup_40();
  public int GetIndexedLookup()
  {
    return GetIndexedLookup_40();
  }

  private native void IndexedLookupOn_41();
  public void IndexedLookupOn()
  {
    IndexedLookupOn_41();
  }

  private native void IndexedLookupOff_42();
  public void IndexedLookupOff()
  {
    IndexedLookupOff_42();
  }

  public vtkScalarsToColors() { super(); }

  public vtkScalarsToColors(long id) { super(id); }
  public native long   VTKInit();

}

// java wrapper for vtkDiscretizableColorTransferFunction object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDiscretizableColorTransferFunction extends vtkColorTransferFunction
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

  private native void SetIndexedColorRGB_7(int id0,double id1[]);
  public void SetIndexedColorRGB(int id0,double id1[])
  {
    SetIndexedColorRGB_7(id0,id1);
  }

  private native void SetIndexedColorRGBA_8(int id0,double id1[]);
  public void SetIndexedColorRGBA(int id0,double id1[])
  {
    SetIndexedColorRGBA_8(id0,id1);
  }

  private native void SetIndexedColor_9(int id0,double id1,double id2,double id3,double id4);
  public void SetIndexedColor(int id0,double id1,double id2,double id3,double id4)
  {
    SetIndexedColor_9(id0,id1,id2,id3,id4);
  }

  private native void GetIndexedColor_10(long id0,double id1[]);
  public void GetIndexedColor(long id0,double id1[])
  {
    GetIndexedColor_10(id0,id1);
  }

  private native void SetNumberOfIndexedColors_11(int id0);
  public void SetNumberOfIndexedColors(int id0)
  {
    SetNumberOfIndexedColors_11(id0);
  }

  private native int GetNumberOfIndexedColors_12();
  public int GetNumberOfIndexedColors()
  {
    return GetNumberOfIndexedColors_12();
  }

  private native void Build_13();
  public void Build()
  {
    Build_13();
  }

  private native void SetDiscretize_14(int id0);
  public void SetDiscretize(int id0)
  {
    SetDiscretize_14(id0);
  }

  private native int GetDiscretize_15();
  public int GetDiscretize()
  {
    return GetDiscretize_15();
  }

  private native void DiscretizeOn_16();
  public void DiscretizeOn()
  {
    DiscretizeOn_16();
  }

  private native void DiscretizeOff_17();
  public void DiscretizeOff()
  {
    DiscretizeOff_17();
  }

  private native void SetUseLogScale_18(int id0);
  public void SetUseLogScale(int id0)
  {
    SetUseLogScale_18(id0);
  }

  private native int GetUseLogScale_19();
  public int GetUseLogScale()
  {
    return GetUseLogScale_19();
  }

  private native void SetNumberOfValues_20(long id0);
  public void SetNumberOfValues(long id0)
  {
    SetNumberOfValues_20(id0);
  }

  private native long GetNumberOfValues_21();
  public long GetNumberOfValues()
  {
    return GetNumberOfValues_21();
  }

  private native void GetColor_22(double id0,double id1[]);
  public void GetColor(double id0,double id1[])
  {
    GetColor_22(id0,id1);
  }

  private native double GetOpacity_23(double id0);
  public double GetOpacity(double id0)
  {
    return GetOpacity_23(id0);
  }

  private native void SetAlpha_24(double id0);
  public void SetAlpha(double id0)
  {
    SetAlpha_24(id0);
  }

  private native void SetNanColor_25(double id0,double id1,double id2);
  public void SetNanColor(double id0,double id1,double id2)
  {
    SetNanColor_25(id0,id1,id2);
  }

  private native void SetNanColor_26(double id0[]);
  public void SetNanColor(double id0[])
  {
    SetNanColor_26(id0);
  }

  private native void SetNanOpacity_27(double id0);
  public void SetNanOpacity(double id0)
  {
    SetNanOpacity_27(id0);
  }

  private native int UsingLogScale_28();
  public int UsingLogScale()
  {
    return UsingLogScale_28();
  }

  private native long GetNumberOfAvailableColors_29();
  public long GetNumberOfAvailableColors()
  {
    return GetNumberOfAvailableColors_29();
  }

  private native void SetScalarOpacityFunction_30(vtkPiecewiseFunction id0);
  public void SetScalarOpacityFunction(vtkPiecewiseFunction id0)
  {
    SetScalarOpacityFunction_30(id0);
  }

  private native long GetScalarOpacityFunction_31();
  public vtkPiecewiseFunction GetScalarOpacityFunction()
  {
    long temp = GetScalarOpacityFunction_31();

    if (temp == 0) return null;
    return (vtkPiecewiseFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetEnableOpacityMapping_32(boolean id0);
  public void SetEnableOpacityMapping(boolean id0)
  {
    SetEnableOpacityMapping_32(id0);
  }

  private native boolean GetEnableOpacityMapping_33();
  public boolean GetEnableOpacityMapping()
  {
    return GetEnableOpacityMapping_33();
  }

  private native void EnableOpacityMappingOn_34();
  public void EnableOpacityMappingOn()
  {
    EnableOpacityMappingOn_34();
  }

  private native void EnableOpacityMappingOff_35();
  public void EnableOpacityMappingOff()
  {
    EnableOpacityMappingOff_35();
  }

  private native long GetMTime_36();
  public long GetMTime()
  {
    return GetMTime_36();
  }

  public vtkDiscretizableColorTransferFunction() { super(); }

  public vtkDiscretizableColorTransferFunction(long id) { super(id); }
  public native long   VTKInit();

}

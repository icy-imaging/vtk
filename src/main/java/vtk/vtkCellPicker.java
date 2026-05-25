// java wrapper for vtkCellPicker object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellPicker extends vtkPicker
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

  private native int Pick_4(double id0,double id1,double id2,vtkRenderer id3);
  public int Pick(double id0,double id1,double id2,vtkRenderer id3)
  {
    return Pick_4(id0,id1,id2,id3);
  }

  private native int Pick3DRay_5(double id0[],double id1[],vtkRenderer id2);
  public int Pick3DRay(double id0[],double id1[],vtkRenderer id2)
  {
    return Pick3DRay_5(id0,id1,id2);
  }

  private native void AddLocator_6(vtkAbstractCellLocator id0);
  public void AddLocator(vtkAbstractCellLocator id0)
  {
    AddLocator_6(id0);
  }

  private native void RemoveLocator_7(vtkAbstractCellLocator id0);
  public void RemoveLocator(vtkAbstractCellLocator id0)
  {
    RemoveLocator_7(id0);
  }

  private native void RemoveAllLocators_8();
  public void RemoveAllLocators()
  {
    RemoveAllLocators_8();
  }

  private native void SetVolumeOpacityIsovalue_9(double id0);
  public void SetVolumeOpacityIsovalue(double id0)
  {
    SetVolumeOpacityIsovalue_9(id0);
  }

  private native double GetVolumeOpacityIsovalue_10();
  public double GetVolumeOpacityIsovalue()
  {
    return GetVolumeOpacityIsovalue_10();
  }

  private native void SetUseVolumeGradientOpacity_11(int id0);
  public void SetUseVolumeGradientOpacity(int id0)
  {
    SetUseVolumeGradientOpacity_11(id0);
  }

  private native void UseVolumeGradientOpacityOn_12();
  public void UseVolumeGradientOpacityOn()
  {
    UseVolumeGradientOpacityOn_12();
  }

  private native void UseVolumeGradientOpacityOff_13();
  public void UseVolumeGradientOpacityOff()
  {
    UseVolumeGradientOpacityOff_13();
  }

  private native int GetUseVolumeGradientOpacity_14();
  public int GetUseVolumeGradientOpacity()
  {
    return GetUseVolumeGradientOpacity_14();
  }

  private native void SetPickClippingPlanes_15(int id0);
  public void SetPickClippingPlanes(int id0)
  {
    SetPickClippingPlanes_15(id0);
  }

  private native void PickClippingPlanesOn_16();
  public void PickClippingPlanesOn()
  {
    PickClippingPlanesOn_16();
  }

  private native void PickClippingPlanesOff_17();
  public void PickClippingPlanesOff()
  {
    PickClippingPlanesOff_17();
  }

  private native int GetPickClippingPlanes_18();
  public int GetPickClippingPlanes()
  {
    return GetPickClippingPlanes_18();
  }

  private native int GetClippingPlaneId_19();
  public int GetClippingPlaneId()
  {
    return GetClippingPlaneId_19();
  }

  private native double[] GetPickNormal_20();
  public double[] GetPickNormal()
  {
    return GetPickNormal_20();
  }

  private native double[] GetMapperNormal_21();
  public double[] GetMapperNormal()
  {
    return GetMapperNormal_21();
  }

  private native int[] GetPointIJK_22();
  public int[] GetPointIJK()
  {
    return GetPointIJK_22();
  }

  private native int[] GetCellIJK_23();
  public int[] GetCellIJK()
  {
    return GetCellIJK_23();
  }

  private native long GetPointId_24();
  public long GetPointId()
  {
    return GetPointId_24();
  }

  private native long GetCellId_25();
  public long GetCellId()
  {
    return GetCellId_25();
  }

  private native int GetSubId_26();
  public int GetSubId()
  {
    return GetSubId_26();
  }

  private native double[] GetPCoords_27();
  public double[] GetPCoords()
  {
    return GetPCoords_27();
  }

  private native long GetTexture_28();
  public vtkTexture GetTexture()
  {
    long temp = GetTexture_28();

    if (temp == 0) return null;
    return (vtkTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPickTextureData_29(int id0);
  public void SetPickTextureData(int id0)
  {
    SetPickTextureData_29(id0);
  }

  private native void PickTextureDataOn_30();
  public void PickTextureDataOn()
  {
    PickTextureDataOn_30();
  }

  private native void PickTextureDataOff_31();
  public void PickTextureDataOff()
  {
    PickTextureDataOff_31();
  }

  private native int GetPickTextureData_32();
  public int GetPickTextureData()
  {
    return GetPickTextureData_32();
  }

  public vtkCellPicker() { super(); }

  public vtkCellPicker(long id) { super(id); }
  public native long   VTKInit();

}

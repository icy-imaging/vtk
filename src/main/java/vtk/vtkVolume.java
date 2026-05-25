// java wrapper for vtkVolume object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVolume extends vtkProp3D
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

  private native void SetMapper_4(vtkAbstractVolumeMapper id0);
  public void SetMapper(vtkAbstractVolumeMapper id0)
  {
    SetMapper_4(id0);
  }

  private native long GetMapper_5();
  public vtkAbstractVolumeMapper GetMapper()
  {
    long temp = GetMapper_5();

    if (temp == 0) return null;
    return (vtkAbstractVolumeMapper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProperty_6(vtkVolumeProperty id0);
  public void SetProperty(vtkVolumeProperty id0)
  {
    SetProperty_6(id0);
  }

  private native long GetProperty_7();
  public vtkVolumeProperty GetProperty()
  {
    long temp = GetProperty_7();

    if (temp == 0) return null;
    return (vtkVolumeProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetVolumes_8(vtkPropCollection id0);
  public void GetVolumes(vtkPropCollection id0)
  {
    GetVolumes_8(id0);
  }

  private native void Update_9();
  public void Update()
  {
    Update_9();
  }

  private native double[] GetBounds_10();
  public double[] GetBounds()
  {
    return GetBounds_10();
  }

  private native void GetBounds_11(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_11(id0);
  }

  private native double GetMinXBound_12();
  public double GetMinXBound()
  {
    return GetMinXBound_12();
  }

  private native double GetMaxXBound_13();
  public double GetMaxXBound()
  {
    return GetMaxXBound_13();
  }

  private native double GetMinYBound_14();
  public double GetMinYBound()
  {
    return GetMinYBound_14();
  }

  private native double GetMaxYBound_15();
  public double GetMaxYBound()
  {
    return GetMaxYBound_15();
  }

  private native double GetMinZBound_16();
  public double GetMinZBound()
  {
    return GetMinZBound_16();
  }

  private native double GetMaxZBound_17();
  public double GetMaxZBound()
  {
    return GetMaxZBound_17();
  }

  private native long GetMTime_18();
  public long GetMTime()
  {
    return GetMTime_18();
  }

  private native long GetRedrawMTime_19();
  public long GetRedrawMTime()
  {
    return GetRedrawMTime_19();
  }

  private native void ShallowCopy_20(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_20(id0);
  }

  private native int RenderVolumetricGeometry_21(vtkViewport id0);
  public int RenderVolumetricGeometry(vtkViewport id0)
  {
    return RenderVolumetricGeometry_21(id0);
  }

  private native void ReleaseGraphicsResources_22(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_22(id0);
  }

  private native float GetGradientOpacityConstant_23(int id0);
  public float GetGradientOpacityConstant(int id0)
  {
    return GetGradientOpacityConstant_23(id0);
  }

  private native float GetGradientOpacityConstant_24();
  public float GetGradientOpacityConstant()
  {
    return GetGradientOpacityConstant_24();
  }

  private native float GetArraySize_25();
  public float GetArraySize()
  {
    return GetArraySize_25();
  }

  private native void UpdateTransferFunctions_26(vtkRenderer id0);
  public void UpdateTransferFunctions(vtkRenderer id0)
  {
    UpdateTransferFunctions_26(id0);
  }

  private native void UpdateScalarOpacityforSampleSize_27(vtkRenderer id0,float id1);
  public void UpdateScalarOpacityforSampleSize(vtkRenderer id0,float id1)
  {
    UpdateScalarOpacityforSampleSize_27(id0,id1);
  }

  private native boolean GetSupportsSelection_28();
  public boolean GetSupportsSelection()
  {
    return GetSupportsSelection_28();
  }

  public vtkVolume() { super(); }

  public vtkVolume(long id) { super(id); }
  public native long   VTKInit();

}

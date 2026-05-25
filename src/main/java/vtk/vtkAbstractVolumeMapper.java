// java wrapper for vtkAbstractVolumeMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractVolumeMapper extends vtkAbstractMapper3D
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

  private native long GetDataSetInput_4();
  public vtkDataSet GetDataSetInput()
  {
    long temp = GetDataSetInput_4();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetDataObjectInput_5();
  public vtkDataObject GetDataObjectInput()
  {
    long temp = GetDataObjectInput_5();

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double[] GetBounds_6();
  public double[] GetBounds()
  {
    return GetBounds_6();
  }

  private native void GetBounds_7(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_7(id0);
  }

  private native void SetScalarMode_8(int id0);
  public void SetScalarMode(int id0)
  {
    SetScalarMode_8(id0);
  }

  private native int GetScalarMode_9();
  public int GetScalarMode()
  {
    return GetScalarMode_9();
  }

  private native void SetArrayAccessMode_10(int id0);
  public void SetArrayAccessMode(int id0)
  {
    SetArrayAccessMode_10(id0);
  }

  private native void SetScalarModeToDefault_11();
  public void SetScalarModeToDefault()
  {
    SetScalarModeToDefault_11();
  }

  private native void SetScalarModeToUsePointData_12();
  public void SetScalarModeToUsePointData()
  {
    SetScalarModeToUsePointData_12();
  }

  private native void SetScalarModeToUseCellData_13();
  public void SetScalarModeToUseCellData()
  {
    SetScalarModeToUseCellData_13();
  }

  private native void SetScalarModeToUsePointFieldData_14();
  public void SetScalarModeToUsePointFieldData()
  {
    SetScalarModeToUsePointFieldData_14();
  }

  private native void SetScalarModeToUseCellFieldData_15();
  public void SetScalarModeToUseCellFieldData()
  {
    SetScalarModeToUseCellFieldData_15();
  }

  private native void SelectScalarArray_16(int id0);
  public void SelectScalarArray(int id0)
  {
    SelectScalarArray_16(id0);
  }

  private native void SelectScalarArray_17(byte[] id0, int len0);
  public void SelectScalarArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectScalarArray_17(bytes0, bytes0.length);
  }

  private native byte[] GetArrayName_18();
  public String GetArrayName()
  {
    return new String(GetArrayName_18(), StandardCharsets.UTF_8);
  }

  private native int GetArrayId_19();
  public int GetArrayId()
  {
    return GetArrayId_19();
  }

  private native int GetArrayAccessMode_20();
  public int GetArrayAccessMode()
  {
    return GetArrayAccessMode_20();
  }

  private native byte[] GetScalarModeAsString_21();
  public String GetScalarModeAsString()
  {
    return new String(GetScalarModeAsString_21(), StandardCharsets.UTF_8);
  }

  private native float GetGradientMagnitudeScale_22();
  public float GetGradientMagnitudeScale()
  {
    return GetGradientMagnitudeScale_22();
  }

  private native float GetGradientMagnitudeBias_23();
  public float GetGradientMagnitudeBias()
  {
    return GetGradientMagnitudeBias_23();
  }

  private native float GetGradientMagnitudeScale_24(int id0);
  public float GetGradientMagnitudeScale(int id0)
  {
    return GetGradientMagnitudeScale_24(id0);
  }

  private native float GetGradientMagnitudeBias_25(int id0);
  public float GetGradientMagnitudeBias(int id0)
  {
    return GetGradientMagnitudeBias_25(id0);
  }

  private native void Render_26(vtkRenderer id0,vtkVolume id1);
  public void Render(vtkRenderer id0,vtkVolume id1)
  {
    Render_26(id0,id1);
  }

  private native void ReleaseGraphicsResources_27(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_27(id0);
  }

  public vtkAbstractVolumeMapper() { super(); }

  public vtkAbstractVolumeMapper(long id) { super(id); }

}

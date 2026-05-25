// java wrapper for vtkAbstractHyperTreeGridMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAbstractHyperTreeGridMapper extends vtkAbstractVolumeMapper
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

  private native void SetInputData_4(vtkUniformHyperTreeGrid id0);
  public void SetInputData(vtkUniformHyperTreeGrid id0)
  {
    SetInputData_4(id0);
  }

  private native void SetInputConnection_5(int id0,vtkAlgorithmOutput id1);
  public void SetInputConnection(int id0,vtkAlgorithmOutput id1)
  {
    SetInputConnection_5(id0,id1);
  }

  private native void SetInputConnection_6(vtkAlgorithmOutput id0);
  public void SetInputConnection(vtkAlgorithmOutput id0)
  {
    SetInputConnection_6(id0);
  }

  private native long GetInput_7();
  public vtkUniformHyperTreeGrid GetInput()
  {
    long temp = GetInput_7();

    if (temp == 0) return null;
    return (vtkUniformHyperTreeGrid)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderer_8(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_8(id0);
  }

  private native long GetRenderer_9();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_9();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScale_10(double id0);
  public void SetScale(double id0)
  {
    SetScale_10(id0);
  }

  private native void SetColorMap_11(vtkScalarsToColors id0);
  public void SetColorMap(vtkScalarsToColors id0)
  {
    SetColorMap_11(id0);
  }

  private native long GetColorMap_12();
  public vtkScalarsToColors GetColorMap()
  {
    long temp = GetColorMap_12();

    if (temp == 0) return null;
    return (vtkScalarsToColors)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetScalarRange_13(double id0,double id1);
  public void SetScalarRange(double id0,double id1)
  {
    SetScalarRange_13(id0,id1);
  }

  private native double[] GetScalarRange_14();
  public double[] GetScalarRange()
  {
    return GetScalarRange_14();
  }

  private native int[] GetViewportSize_15();
  public int[] GetViewportSize()
  {
    return GetViewportSize_15();
  }

  private native long GetMTime_16();
  public long GetMTime()
  {
    return GetMTime_16();
  }

  private native void ReleaseGraphicsResources_17(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_17(id0);
  }

  private native void Render_18(vtkRenderer id0,vtkVolume id1);
  public void Render(vtkRenderer id0,vtkVolume id1)
  {
    Render_18(id0,id1);
  }

  public vtkAbstractHyperTreeGridMapper() { super(); }

  public vtkAbstractHyperTreeGridMapper(long id) { super(id); }

}

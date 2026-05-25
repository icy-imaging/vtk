// java wrapper for vtkSurfaceNets2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSurfaceNets2D extends vtkPolyDataAlgorithm
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetValue_5(int id0,double id1);
  public void SetValue(int id0,double id1)
  {
    SetValue_5(id0,id1);
  }

  private native void SetLabel_6(int id0,double id1);
  public void SetLabel(int id0,double id1)
  {
    SetLabel_6(id0,id1);
  }

  private native double GetValue_7(int id0);
  public double GetValue(int id0)
  {
    return GetValue_7(id0);
  }

  private native double GetLabel_8(int id0);
  public double GetLabel(int id0)
  {
    return GetLabel_8(id0);
  }

  private native void SetNumberOfLabels_9(int id0);
  public void SetNumberOfLabels(int id0)
  {
    SetNumberOfLabels_9(id0);
  }

  private native void SetNumberOfContours_10(int id0);
  public void SetNumberOfContours(int id0)
  {
    SetNumberOfContours_10(id0);
  }

  private native long GetNumberOfLabels_11();
  public long GetNumberOfLabels()
  {
    return GetNumberOfLabels_11();
  }

  private native long GetNumberOfContours_12();
  public long GetNumberOfContours()
  {
    return GetNumberOfContours_12();
  }

  private native void GenerateLabels_13(int id0,double id1[]);
  public void GenerateLabels(int id0,double id1[])
  {
    GenerateLabels_13(id0,id1);
  }

  private native void GenerateValues_14(int id0,double id1[]);
  public void GenerateValues(int id0,double id1[])
  {
    GenerateValues_14(id0,id1);
  }

  private native void GenerateLabels_15(int id0,double id1,double id2);
  public void GenerateLabels(int id0,double id1,double id2)
  {
    GenerateLabels_15(id0,id1,id2);
  }

  private native void GenerateValues_16(int id0,double id1,double id2);
  public void GenerateValues(int id0,double id1,double id2)
  {
    GenerateValues_16(id0,id1,id2);
  }

  private native void SetComputeScalars_17(boolean id0);
  public void SetComputeScalars(boolean id0)
  {
    SetComputeScalars_17(id0);
  }

  private native boolean GetComputeScalars_18();
  public boolean GetComputeScalars()
  {
    return GetComputeScalars_18();
  }

  private native void ComputeScalarsOn_19();
  public void ComputeScalarsOn()
  {
    ComputeScalarsOn_19();
  }

  private native void ComputeScalarsOff_20();
  public void ComputeScalarsOff()
  {
    ComputeScalarsOff_20();
  }

  private native void SetBackgroundLabel_21(double id0);
  public void SetBackgroundLabel(double id0)
  {
    SetBackgroundLabel_21(id0);
  }

  private native double GetBackgroundLabel_22();
  public double GetBackgroundLabel()
  {
    return GetBackgroundLabel_22();
  }

  private native void SetArrayComponent_23(int id0);
  public void SetArrayComponent(int id0)
  {
    SetArrayComponent_23(id0);
  }

  private native int GetArrayComponent_24();
  public int GetArrayComponent()
  {
    return GetArrayComponent_24();
  }

  private native void SetSmoothing_25(boolean id0);
  public void SetSmoothing(boolean id0)
  {
    SetSmoothing_25(id0);
  }

  private native boolean GetSmoothing_26();
  public boolean GetSmoothing()
  {
    return GetSmoothing_26();
  }

  private native void SmoothingOn_27();
  public void SmoothingOn()
  {
    SmoothingOn_27();
  }

  private native void SmoothingOff_28();
  public void SmoothingOff()
  {
    SmoothingOff_28();
  }

  private native long GetSmoother_29();
  public vtkConstrainedSmoothingFilter GetSmoother()
  {
    long temp = GetSmoother_29();

    if (temp == 0) return null;
    return (vtkConstrainedSmoothingFilter)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetDataCaching_30(boolean id0);
  public void SetDataCaching(boolean id0)
  {
    SetDataCaching_30(id0);
  }

  private native boolean GetDataCaching_31();
  public boolean GetDataCaching()
  {
    return GetDataCaching_31();
  }

  private native void DataCachingOn_32();
  public void DataCachingOn()
  {
    DataCachingOn_32();
  }

  private native void DataCachingOff_33();
  public void DataCachingOff()
  {
    DataCachingOff_33();
  }

  public vtkSurfaceNets2D() { super(); }

  public vtkSurfaceNets2D(long id) { super(id); }
  public native long   VTKInit();

}

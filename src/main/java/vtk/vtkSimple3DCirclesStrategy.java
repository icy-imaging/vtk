// java wrapper for vtkSimple3DCirclesStrategy object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSimple3DCirclesStrategy extends vtkGraphLayoutStrategy
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

  private native void SetMethod_4(int id0);
  public void SetMethod(int id0)
  {
    SetMethod_4(id0);
  }

  private native int GetMethod_5();
  public int GetMethod()
  {
    return GetMethod_5();
  }

  private native void SetRadius_6(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_6(id0);
  }

  private native double GetRadius_7();
  public double GetRadius()
  {
    return GetRadius_7();
  }

  private native void SetHeight_8(double id0);
  public void SetHeight(double id0)
  {
    SetHeight_8(id0);
  }

  private native double GetHeight_9();
  public double GetHeight()
  {
    return GetHeight_9();
  }

  private native void SetOrigin_10(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_10(id0,id1,id2);
  }

  private native void SetOrigin_11(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_11(id0);
  }

  private native double[] GetOrigin_12();
  public double[] GetOrigin()
  {
    return GetOrigin_12();
  }

  private native void SetDirection_13(double id0,double id1,double id2);
  public void SetDirection(double id0,double id1,double id2)
  {
    SetDirection_13(id0,id1,id2);
  }

  private native void SetDirection_14(double id0[]);
  public void SetDirection(double id0[])
  {
    SetDirection_14(id0);
  }

  private native double[] GetDirection_15();
  public double[] GetDirection()
  {
    return GetDirection_15();
  }

  private native void SetMarkedStartVertices_16(vtkAbstractArray id0);
  public void SetMarkedStartVertices(vtkAbstractArray id0)
  {
    SetMarkedStartVertices_16(id0);
  }

  private native long GetMarkedStartVertices_17();
  public vtkAbstractArray GetMarkedStartVertices()
  {
    long temp = GetMarkedStartVertices_17();

    if (temp == 0) return null;
    return (vtkAbstractArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetForceToUseUniversalStartPointsFinder_18(int id0);
  public void SetForceToUseUniversalStartPointsFinder(int id0)
  {
    SetForceToUseUniversalStartPointsFinder_18(id0);
  }

  private native int GetForceToUseUniversalStartPointsFinder_19();
  public int GetForceToUseUniversalStartPointsFinder()
  {
    return GetForceToUseUniversalStartPointsFinder_19();
  }

  private native void ForceToUseUniversalStartPointsFinderOn_20();
  public void ForceToUseUniversalStartPointsFinderOn()
  {
    ForceToUseUniversalStartPointsFinderOn_20();
  }

  private native void ForceToUseUniversalStartPointsFinderOff_21();
  public void ForceToUseUniversalStartPointsFinderOff()
  {
    ForceToUseUniversalStartPointsFinderOff_21();
  }

  private native void SetAutoHeight_22(int id0);
  public void SetAutoHeight(int id0)
  {
    SetAutoHeight_22(id0);
  }

  private native int GetAutoHeight_23();
  public int GetAutoHeight()
  {
    return GetAutoHeight_23();
  }

  private native void AutoHeightOn_24();
  public void AutoHeightOn()
  {
    AutoHeightOn_24();
  }

  private native void AutoHeightOff_25();
  public void AutoHeightOff()
  {
    AutoHeightOff_25();
  }

  private native void SetMinimumRadian_26(double id0);
  public void SetMinimumRadian(double id0)
  {
    SetMinimumRadian_26(id0);
  }

  private native double GetMinimumRadian_27();
  public double GetMinimumRadian()
  {
    return GetMinimumRadian_27();
  }

  private native void SetMinimumDegree_28(double id0);
  public void SetMinimumDegree(double id0)
  {
    SetMinimumDegree_28(id0);
  }

  private native double GetMinimumDegree_29();
  public double GetMinimumDegree()
  {
    return GetMinimumDegree_29();
  }

  private native void SetHierarchicalLayers_30(vtkIntArray id0);
  public void SetHierarchicalLayers(vtkIntArray id0)
  {
    SetHierarchicalLayers_30(id0);
  }

  private native long GetHierarchicalLayers_31();
  public vtkIntArray GetHierarchicalLayers()
  {
    long temp = GetHierarchicalLayers_31();

    if (temp == 0) return null;
    return (vtkIntArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetHierarchicalOrder_32(vtkIdTypeArray id0);
  public void SetHierarchicalOrder(vtkIdTypeArray id0)
  {
    SetHierarchicalOrder_32(id0);
  }

  private native long GetHierarchicalOrder_33();
  public vtkIdTypeArray GetHierarchicalOrder()
  {
    long temp = GetHierarchicalOrder_33();

    if (temp == 0) return null;
    return (vtkIdTypeArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Layout_34();
  public void Layout()
  {
    Layout_34();
  }

  private native void SetGraph_35(vtkGraph id0);
  public void SetGraph(vtkGraph id0)
  {
    SetGraph_35(id0);
  }

  public vtkSimple3DCirclesStrategy() { super(); }

  public vtkSimple3DCirclesStrategy(long id) { super(id); }
  public native long   VTKInit();

}
